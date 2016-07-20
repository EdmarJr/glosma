package br.com.glosma.associacao.core.interfaces.hospital;

import br.com.glosma.associacao.core.interfaces.IProcedimentoExecutado;

public interface IProcedimentoExecutadoHospital extends IProcedimentoExecutado {

	String getDataExecutacao();

	String getHoraInicial();

	String getHoraFinal();

	String getCodigoTabela();

	String getCodigoProcedimento();

	String getDescricaoProcedimento();

	String getQuantidadeExecutada();

	String getReducaoAcrescimo();

	String getValorUnitario();

	String getValorTotal();

}
