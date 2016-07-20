package br.com.glosma.associacao.faturas.commons.infra;

public interface IManipulador {
	<T> T obterObjetoPopuladoComDadosDoArquivo(Class<T> clazzOfObjeto, String enderecoArquivo);
}
