package br.com.glosma.associacao.faturas.commons;

import java.lang.reflect.InvocationTargetException;

import br.com.glosma.associacao.core.interfaces.IFatura;
import br.com.glosma.associacao.faturas.commons.enums.IOpcoesEnum;

public class FaturaFactory {
	public IFatura obterFatura(
			IOpcoesEnum hospital,String enderecoArquivos) {

		try {
			return (IFatura) hospital.getClassOfAdapter()
					.getDeclaredConstructor(hospital.getClassContainerDados())
					.newInstance(ManipuladorFactory.getInstanceOfManipulador(hospital.getTipoArquivo())
							.obterObjetoPopuladoComDadosDoArquivo(hospital.getClassContainerDados(), enderecoArquivos));
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
