package br.com.glosma.associacao.resources;

import java.util.List;

import br.com.glosma.associacao.core.ResultadoComparacaoProcedimento;

public class ResultadoAssociacao {
	private List<ResultadoComparacaoProcedimento> resultadoAssociacaoProcedimentos;
	
	public ResultadoAssociacao(List<ResultadoComparacaoProcedimento> resultadoAssociacaorocedimentos) {
		this.resultadoAssociacaoProcedimentos = resultadoAssociacaorocedimentos;
	}

	public List<ResultadoComparacaoProcedimento> getResultadoAssociacaoProcedimentos() {
		return resultadoAssociacaoProcedimentos;
	}

	public void setResultadoAssociacaorocedimentos(List<ResultadoComparacaoProcedimento> resultadoAssociacaoProcedimentos) {
		this.resultadoAssociacaoProcedimentos = resultadoAssociacaoProcedimentos;
	}
	
	
}
