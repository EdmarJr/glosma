package br.com.glosma.associacao.faturas.hospital;

import br.com.glosma.associacao.faturas.commons.FaturaFactory;

public class FaturaHospitalFactory extends FaturaFactory {
	private static FaturaHospitalFactory faturaHospitalFactory = new FaturaHospitalFactory();

	public static FaturaHospitalFactory getInstance() {
		return faturaHospitalFactory;
	}
}
