package br.com.glosma.associacao.core.interfaces.hospital;

import java.util.List;

import br.com.glosma.associacao.core.interfaces.IFatura;

public interface IFaturaHospital extends IFatura {
	public List<IProcedimentoExecutadoHospital> getProcedimentosExecutados();
}
