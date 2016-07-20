package br.com.glosma.associacao.faturas.commons.infra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.csvreader.CsvReader;

import br.com.glosma.associacao.faturas.commons.infra.csv.FieldCSV;
import br.com.glosma.associacao.faturas.commons.infra.csv.ListCSV;

public class CSVManipulador implements IManipulador {
	@Override
	public <T> T obterObjetoPopuladoComDadosDoArquivo(Class<T> clazzOfObjeto,String enderecoArquivo) {
		
		try {
			URL website = new URL(enderecoArquivo);
			File arquivo = new File("./temp/temp.csv");
			FileUtils.copyURLToFile(website, arquivo);
			
			return mapearDadosArquivoParaClasse(arquivo, clazzOfObjeto);
		} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException
				| IOException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	private interface Acao {
		void executar(Field field);
	}

	private <T> T mapearDadosArquivoParaClasse(File arquivo, Class<T> clazzOfObjeto)
			throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
		
		T retorno = clazzOfObjeto.newInstance();
		
		realizarAcaoEmCadaCampoDeclaradoDentroDoObjeto(retorno,(field)-> {
			try {			
				realizarPreenchimentoDoObjetoBaseadoNasAnotacoesDeSuaClasse(arquivo, retorno, field, new CsvReader(arquivo.getAbsolutePath(), ';'));
			} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException
					| IOException e) {
				e.printStackTrace();
			}
		});
		
		return retorno;
	}


	private <T> void realizarAcaoEmCadaCampoDeclaradoDentroDoObjeto(T objeto, Acao acao)
			throws InstantiationException, IllegalAccessException, FileNotFoundException, IOException,
			NoSuchMethodException, InvocationTargetException {
		Field[] declaredFields = objeto.getClass().getDeclaredFields();
		for (Field field : declaredFields) {
			acao.executar(field);
		}
	}

	private <T> void realizarPreenchimentoDoObjetoBaseadoNasAnotacoesDeSuaClasse(File arquivo, T objeto, Field field, CsvReader csvReader)
			throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException,
			InstantiationException, FileNotFoundException {
		Annotation[] annotations = field.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation.annotationType().equals(ListCSV.class)) {
				ListCSV annotationInstance = field.getAnnotation(ListCSV.class);
				pularLinhas(csvReader, (annotationInstance.indexLineStart() - 2));
				
				int contador = annotationInstance.indexLineStart();
				while(csvReader.readRecord()) {
					
					Class<?> classOfGenericType = UtilsReflexao.getClassOfGenericType(field);
					List lista = (List) UtilsReflexao.invocarMetodoGet(objeto, field.getName());
					
					Object itemLista = classOfGenericType.newInstance();
					realizarAcaoEmCadaCampoDeclaradoDentroDoObjeto(itemLista,(fieldInside)-> {
						try {
							realizarPreenchimentoDoObjetoBaseadoNasAnotacoesDeSuaClasse(arquivo, itemLista, fieldInside, csvReader);
						} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException
								| IOException e) {
							e.printStackTrace();
						}
					});
					
					
					lista.add(itemLista);
					
					++contador;
					if(annotationInstance.indexLineFinish() != -1 && contador > annotationInstance.indexLineFinish()) {
						break;
					}
				}
				
				
			} else if (annotation.annotationType().equals(FieldCSV.class)) {
				FieldCSV annotationInstance = field.getAnnotation(FieldCSV.class);
				if(!annotationInstance.isDadoNaLinhaAtual()) {
					pularLinhas(csvReader, (annotationInstance.indexLine() -1));
				}
				Method metodo = UtilsReflexao.getMethodWithoutParameters(objeto.getClass(),
						"set" + UtilsReflexao.obterTextoComPrimeiraLetraMaiuscula(field.getName()));
				metodo.invoke(objeto,
								csvReader.get(annotationInstance.indexColumn()).toString());
			}
		}
	}
	
	public void pularLinhas(CsvReader csvReader, Integer quantidadeDeLinhas) throws IOException {
		for (int i = 0; i < quantidadeDeLinhas; i++) {
			csvReader.readRecord();
		}

	}
	
	

	
}
