package br.com.glosma.associacao.faturas.convenio.glosamaxx;

import java.util.ArrayList;
import java.util.List;

import br.com.glosma.associacao.core.interfaces.convenio.IFaturaConvenio;
import br.com.glosma.associacao.core.interfaces.convenio.IProcedimentoExecutadoCovenio;
import br.com.glosma.associacao.faturas.convenio.glosamaxx.ContainerDadosGlosaMaxxCSV.ProcedimentoGlosaMaxxCSV;

public class ContainerDadosGlosaMaxxCSVAdapter implements IFaturaConvenio {

	private ContainerDadosGlosaMaxxCSV containerDados;

	public ContainerDadosGlosaMaxxCSVAdapter(ContainerDadosGlosaMaxxCSV containerDados) {
		this.containerDados = containerDados;
	}

	@Override
	public List<IProcedimentoExecutadoCovenio> getProcedimentosExecutados() {
		
		List<IProcedimentoExecutadoCovenio> retorno = new ArrayList<IProcedimentoExecutadoCovenio>();

		for (ProcedimentoGlosaMaxxCSV procedimentoGlosaMaxxCSV : containerDados.getProcedimentos()) {
			retorno.add(procedimentoGlosaMaxxCSV);
		}
		return retorno;

	}

}
