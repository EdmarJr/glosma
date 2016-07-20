package br.com.glosma.associacao.faturas.commons.infra;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;

public class XMLManipulador implements IManipulador {
	public <T> T obterObjetoPopuladoComDadosDoArquivo(Class<T> clazzOfObjeto,String enderecoArquivo) {
		JAXBContext jaxbContext;
		try {
			
			URL website;
			try {
				website = new URL(enderecoArquivo);
				File arquivo = new File("./temp/temp.xml");
				FileUtils.copyURLToFile(website, arquivo);
				jaxbContext = JAXBContext.newInstance(clazzOfObjeto);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				T retorno = (T) jaxbUnmarshaller.unmarshal(arquivo);
				return retorno;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;

	}

}
