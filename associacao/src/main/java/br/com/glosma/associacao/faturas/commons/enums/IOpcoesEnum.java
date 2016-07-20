package br.com.glosma.associacao.faturas.commons.enums;

public interface IOpcoesEnum {
	public Class<?> getClassContainerDados() ;


	public Class<?> getClassOfAdapter();

	public TipoAquivoEnum getTipoArquivo();
	
	public Integer getCodigo();
	
	public static IOpcoesEnum obterOpcaoPorCodigo(IOpcoesEnum[] opcoes, Integer codigo) {
		for (IOpcoesEnum iOpcao : opcoes) {
			if (iOpcao.getCodigo().equals(codigo)) {
				return iOpcao;
			}
		}
		return null;

	}
}
