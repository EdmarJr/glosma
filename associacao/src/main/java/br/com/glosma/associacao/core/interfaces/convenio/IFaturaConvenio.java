package br.com.glosma.associacao.core.interfaces.convenio;

import java.util.List;

import br.com.glosma.associacao.core.interfaces.IFatura;

public interface IFaturaConvenio extends IFatura{
	public List<IProcedimentoExecutadoCovenio> getProcedimentosExecutados();
}
