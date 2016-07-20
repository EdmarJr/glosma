package br.com.glosma.associacao.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.glosma.associacao.core.enums.StatusProcedimento;
import br.com.glosma.associacao.core.interfaces.convenio.IProcedimentoExecutadoCovenio;
import br.com.glosma.associacao.core.interfaces.hospital.IProcedimentoExecutadoHospital;


public class Comparador {
	public static List<ResultadoComparacaoProcedimento> realizarComparacao(
			List<IProcedimentoExecutadoHospital> procedimentosHospital,
			List<IProcedimentoExecutadoCovenio> procedimentosConvenio) {
		List<ResultadoComparacaoProcedimento> resultadosComparacao = new ArrayList<ResultadoComparacaoProcedimento>();
		for (IProcedimentoExecutadoHospital procedimentoInFor : procedimentosHospital) {

			IProcedimentoExecutadoCovenio procedimentoDoConvenio = obterFaturaDoConvenioPorCodigoServico(
					procedimentosConvenio,
					procedimentoInFor.getCodigoProcedimento());
			if (procedimentoDoConvenio == null) {
				resultadosComparacao.add(new ResultadoComparacaoProcedimento(
						procedimentoDoConvenio,procedimentoInFor, StatusProcedimento.NAO_PAGO));
			} else {
				BigDecimal valorTotalInformadoParaOProcedimento = new BigDecimal(
						procedimentoInFor.getValorTotal());
				String valorLiberadoComPontos = procedimentoDoConvenio
						.getValorLiberado().replace(".", "").replace(",", ".");
				BigDecimal valorLiberado = new BigDecimal(
						valorLiberadoComPontos);
				if (seValorInformadonoXmlEMaiorOuMenorQueOValorLiberado(
						valorTotalInformadoParaOProcedimento, valorLiberado)) {
					
					resultadosComparacao.add(new ResultadoComparacaoProcedimento(
							procedimentoDoConvenio,procedimentoInFor,
							StatusProcedimento.DIFERENCA));
				} else {
					resultadosComparacao.add(new ResultadoComparacaoProcedimento(
							procedimentoDoConvenio,procedimentoInFor, StatusProcedimento.PAGO));
				}
			}
		}
		return resultadosComparacao;
	}

	private static boolean seValorInformadonoXmlEMaiorOuMenorQueOValorLiberado(
			BigDecimal valorTotalInformadoParaOProcedimento,
			BigDecimal valorLiberado) {
		return valorTotalInformadoParaOProcedimento
				.compareTo(valorLiberado) == 1
				|| valorTotalInformadoParaOProcedimento
						.compareTo(valorLiberado) == -1;
	}

	public static IProcedimentoExecutadoCovenio obterFaturaDoConvenioPorCodigoServico(
			List<IProcedimentoExecutadoCovenio> procedimentosConvenio, String codigoDoServico) {
		for (IProcedimentoExecutadoCovenio procedimentoConvenio : procedimentosConvenio) {
			if (procedimentoConvenio.getCodigoServico().equals(codigoDoServico)) {
				return procedimentoConvenio;
			}
		}
		return null;

	}
}
