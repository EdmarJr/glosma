package br.com.glosma.associacao.core;

import br.com.glosma.associacao.core.enums.StatusProcedimento;
import br.com.glosma.associacao.core.interfaces.convenio.IProcedimentoExecutadoCovenio;
import br.com.glosma.associacao.core.interfaces.hospital.IProcedimentoExecutadoHospital;

public class ResultadoComparacaoProcedimento {

	private IProcedimentoExecutadoCovenio procedimentoConvenio;
	private StatusProcedimento status;
	private IProcedimentoExecutadoHospital procedimentoHospital;
	// campos somente para forçar a chamada do GET na conversão para JSON
	private String codigoProcedimento;
	private String valorLiberado;
	private String valorInformado;
	
	
	public ResultadoComparacaoProcedimento(IProcedimentoExecutadoCovenio procedimentoConvenio,
			IProcedimentoExecutadoHospital procedimentoHospital, StatusProcedimento status) {
		this.procedimentoConvenio = procedimentoConvenio;
		this.procedimentoHospital = procedimentoHospital;
		this.status = status;
	}

	public IProcedimentoExecutadoHospital getProcedimentoHospital() {
		return procedimentoHospital;
	}

	public void setProcedimentoHospital(IProcedimentoExecutadoHospital procedimentoHospital) {
		this.procedimentoHospital = procedimentoHospital;
	}

	public IProcedimentoExecutadoCovenio getProcedimentoConvenio() {
		return procedimentoConvenio;
	}

	public void setProcedimentoConvenio(IProcedimentoExecutadoCovenio procedimentoConvenio) {
		this.procedimentoConvenio = procedimentoConvenio;
	}

	public StatusProcedimento getStatus() {
		return status;
	}

	public void setStatus(StatusProcedimento status) {
		this.status = status;
	}

	public String getCodigoProcedimento() {
		return getProcedimentoHospital() != null ? getProcedimentoHospital().getCodigoProcedimento(): null;
	}


	public String getValorLiberado() {
		return getProcedimentoConvenio() != null ? getProcedimentoConvenio().getValorLiberado() : null;
	}


	public String getValorInformado() {
		return getProcedimentoConvenio() != null ? getProcedimentoConvenio().getValorInformado() : null;
	}

	
}
