package br.com.glosma.associacao.faturas.convenio;

import br.com.glosatime1.service.GlosaMaxxCrawler;
import br.com.glosma.associacao.faturas.commons.enums.TipoAquivoEnum;
import br.com.glosma.associacao.faturas.convenio.crawlers.Crawler;
import br.com.glosma.associacao.faturas.convenio.enums.IOpcoesConvenioEnum;
import br.com.glosma.associacao.faturas.convenio.glosamaxx.ContainerDadosGlosaMaxxCSV;
import br.com.glosma.associacao.faturas.convenio.glosamaxx.ContainerDadosGlosaMaxxCSVAdapter;

public enum ConvenioEnum implements IOpcoesConvenioEnum {
	GLOSA_MAXX(1,ContainerDadosGlosaMaxxCSV.class, ContainerDadosGlosaMaxxCSVAdapter.class,TipoAquivoEnum.CSV,GlosaMaxxCrawler.getInstance());

	private Class<?> classContainerDados;
	private Class<?> classOfAdapter;
	private TipoAquivoEnum tipoArquivo;
	private Integer codigo;
	private Crawler crawler;

	private ConvenioEnum(Integer codigo, Class<?> classContainerDados, Class<?> classOfAdapter,TipoAquivoEnum tipoArquivo, Crawler crawler) {
		this.codigo = codigo;
		this.classContainerDados = classContainerDados;
		this.classOfAdapter = classOfAdapter;
		this.tipoArquivo = tipoArquivo;
		this.crawler = crawler;
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

	public Integer getCodigo() {
		return codigo;
	}

	public Crawler getCrawler() {
		return crawler;
	}
	
	
	

	
	

}
