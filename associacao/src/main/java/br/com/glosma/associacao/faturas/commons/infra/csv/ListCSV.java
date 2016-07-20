package br.com.glosma.associacao.faturas.commons.infra.csv;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface ListCSV {
	int indexLineStart() default 0;
	/*
	 * set -1 to get all lines until the final of csv
	 */
	int indexLineFinish() default -1;
}
