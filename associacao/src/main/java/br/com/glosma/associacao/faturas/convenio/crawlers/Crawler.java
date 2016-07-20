package br.com.glosma.associacao.faturas.convenio.crawlers;

import java.util.Date;
import java.util.List;

public interface Crawler {
	public List<String> obterListaDeUrlsPorPeriodo(Date periodo, String enderecoPrincipal);
}
