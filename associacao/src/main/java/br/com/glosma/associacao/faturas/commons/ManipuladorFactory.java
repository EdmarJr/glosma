package br.com.glosma.associacao.faturas.commons;

import br.com.glosma.associacao.faturas.commons.enums.TipoAquivoEnum;
import br.com.glosma.associacao.faturas.commons.infra.CSVManipulador;
import br.com.glosma.associacao.faturas.commons.infra.IManipulador;
import br.com.glosma.associacao.faturas.commons.infra.XMLManipulador;

public class ManipuladorFactory {
	private static XMLManipulador xmlManipulador;
	private static CSVManipulador csvManipulador;
	static {
		xmlManipulador = new XMLManipulador();
		csvManipulador = new CSVManipulador();
	}

	public static IManipulador getInstanceOfManipulador(TipoAquivoEnum tipoArquivo) {
		if(TipoAquivoEnum.XML == tipoArquivo) {
			return xmlManipulador;
		} else if(TipoAquivoEnum.CSV == tipoArquivo) {
			return csvManipulador;
		}
		return null;
	}
}
