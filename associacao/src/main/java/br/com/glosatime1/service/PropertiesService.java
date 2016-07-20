package br.com.glosatime1.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Classe responsável pelos servicos de manipulação de arquivos de propriedades
 * @author aspira
 *
 */
public class PropertiesService {
	/**
	 * Retorna o valor de uma propriedade do arquivo de configuração config.properties
	 * @param property Nome da chave que deseja retornar o valor
	 * @return Informação da Propriedade
	 */
	public static String getPropValue(String property) {
		String result = "";
		InputStream inputStream;

		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
			// inputStream =
			// getClass().getClassLoader().getResourceAsStream(property);
			inputStream = new FileInputStream(System.getProperty("user.dir")
					+ File.separator + "src" + File.separator + "main"
					+ File.separator + "resources" + File.separator
					+ propFileName);

			prop.load(inputStream);

			// get the property value and print it out
			result = prop.getProperty(property);
			inputStream.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		return result;
	}
}
