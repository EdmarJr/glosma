package br.com.glosma.associacao.faturas.hospital;

import br.com.glosma.associacao.faturas.commons.enums.IOpcoesEnum;
import br.com.glosma.associacao.faturas.commons.enums.TipoAquivoEnum;
import br.com.glosma.associacao.faturas.hospital.santahelena.ContainerDadosSantaHelenaXML;
import br.com.glosma.associacao.faturas.hospital.santahelena.ContainerDadosSantaHelenaXMLAdapter;

public enum HospitalEnum implements IOpcoesEnum {
	SANTA_HELENA(1,ContainerDadosSantaHelenaXML.class, ContainerDadosSantaHelenaXMLAdapter.class,TipoAquivoEnum.XML);

	private Class<?> classContainerDados;
	private Class<?> classOfAdapter;
	private TipoAquivoEnum tipoArquivo;
	private Integer codigo;

	private HospitalEnum(Integer codigo, Class<?> classContainerDados, Class<?> classOfAdapter,TipoAquivoEnum tipoArquivo) {
		this.codigo = codigo;
		this.classContainerDados = classContainerDados;
		this.classOfAdapter = classOfAdapter;
		this.tipoArquivo = tipoArquivo;
	}

	public Class<?> getClassContainerDados() {
		return classContainerDados;
	}


	public Class<?> getClassOfAdapter() {
		return classOfAdapter;
	}

	public TipoAquivoEnum getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(TipoAquivoEnum tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	
	
	
	
	

}
