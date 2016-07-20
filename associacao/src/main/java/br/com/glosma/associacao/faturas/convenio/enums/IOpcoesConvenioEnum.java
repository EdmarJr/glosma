package br.com.glosma.associacao.faturas.convenio.enums;

import br.com.glosma.associacao.faturas.commons.enums.IOpcoesEnum;
import br.com.glosma.associacao.faturas.convenio.crawlers.Crawler;

public interface IOpcoesConvenioEnum extends IOpcoesEnum {
	public Crawler getCrawler();
}
