package br.com.glosma.associacao.faturas.commons.infra.csv;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface FieldCSV {
	int indexLine() default -1;
	int indexColumn() default -1;
	boolean isDadoNaLinhaAtual() default false;
}
