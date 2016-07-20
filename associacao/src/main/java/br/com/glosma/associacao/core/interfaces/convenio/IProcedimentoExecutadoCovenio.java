package br.com.glosma.associacao.core.interfaces.convenio;

import br.com.glosma.associacao.core.interfaces.IProcedimentoExecutado;

public interface IProcedimentoExecutadoCovenio extends IProcedimentoExecutado {

	public String getBeneficiario();

	public String getDescricaoGlosa();

	public String getValorGlosa();

	public String getValorLiberado();

	public String getValorInformado();

	public String getQuantidadeExecutada();

	public String getCodigoServico();

	public String getDataRealizacao();

}
