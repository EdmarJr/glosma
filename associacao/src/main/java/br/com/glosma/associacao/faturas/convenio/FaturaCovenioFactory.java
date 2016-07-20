package br.com.glosma.associacao.faturas.convenio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.glosma.associacao.core.interfaces.convenio.IFaturaConvenio;
import br.com.glosma.associacao.core.interfaces.convenio.IProcedimentoExecutadoCovenio;
import br.com.glosma.associacao.faturas.commons.FaturaFactory;
import br.com.glosma.associacao.faturas.commons.enums.IOpcoesEnum;
import br.com.glosma.associacao.faturas.convenio.crawlers.Crawler;
import br.com.glosma.associacao.faturas.convenio.enums.IOpcoesConvenioEnum;

public class FaturaCovenioFactory extends FaturaFactory {
	private static FaturaCovenioFactory faturaCovenioFactory = new FaturaCovenioFactory();

	public static FaturaCovenioFactory getInstance() {
		return faturaCovenioFactory;
	}

	public IFaturaConvenio obterFatura(IOpcoesEnum opcao, String urlSitePrincipal) {
		
		List<IProcedimentoExecutadoCovenio> listaDeProcedimentosConvenio = new ArrayList<IProcedimentoExecutadoCovenio>();
		try {
			List<String> enderecosCsvs = obterEnderecosDosArquivosDoConvenioNaDataAtual(((IOpcoesConvenioEnum) opcao).getCrawler(),urlSitePrincipal);
			for (String url : enderecosCsvs) {
				listaDeProcedimentosConvenio = fundirListas(listaDeProcedimentosConvenio, super.obterFatura(
						opcao,
						url.toString()).getProcedimentosExecutados());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		final List<IProcedimentoExecutadoCovenio> retorno = new ArrayList<IProcedimentoExecutadoCovenio>(
				listaDeProcedimentosConvenio);
		return new IFaturaConvenio() {

			@Override
			public List<IProcedimentoExecutadoCovenio> getProcedimentosExecutados() {
				return retorno;
			}
		};
	}

	private List<String> obterEnderecosDosArquivosDoConvenioNaDataAtual(Crawler crawler, String urlSitePrincipal) throws IOException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, Calendar.MAY);
		return crawler.obterListaDeUrlsPorPeriodo(calendar.getTime(), urlSitePrincipal);
	}

	public List<IProcedimentoExecutadoCovenio> fundirListas(List destino, List origem) {
		ArrayList lista = new ArrayList();
		lista.addAll(destino);
		lista.addAll(origem);
		return lista;
	}
}
