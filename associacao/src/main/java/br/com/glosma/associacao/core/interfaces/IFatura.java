package br.com.glosma.associacao.core.interfaces;

import java.util.List;

public interface IFatura {
	public List<? extends IProcedimentoExecutado> getProcedimentosExecutados();
}
