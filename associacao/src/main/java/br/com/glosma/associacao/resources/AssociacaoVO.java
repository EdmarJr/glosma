package br.com.glosma.associacao.resources;

public class AssociacaoVO {
	private String urlArquivoHospital;
	private Integer codigoHospital;
	private String urlConvenioSitePrincipal;
	private Integer codigoConvenio;

	public String getUrlArquivoHospital() {
		return urlArquivoHospital;
	}

	public void setUrlArquivoHospital(String urlArquivoHospital) {
		this.urlArquivoHospital = urlArquivoHospital;
	}

	public Integer getCodigoHospital() {
		return codigoHospital;
	}

	public void setCodigoHospital(Integer codigoHospital) {
		this.codigoHospital = codigoHospital;
	}


	public String getUrlConvenioSitePrincipal() {
		return urlConvenioSitePrincipal;
	}

	public void setUrlConvenioSitePrincipal(String urlConvenioSitePrincipal) {
		this.urlConvenioSitePrincipal = urlConvenioSitePrincipal;
	}

	public Integer getCodigoConvenio() {
		return codigoConvenio;
	}

	public void setCodigoConvenio(Integer codigoConvenio) {
		this.codigoConvenio = codigoConvenio;
	}
}
