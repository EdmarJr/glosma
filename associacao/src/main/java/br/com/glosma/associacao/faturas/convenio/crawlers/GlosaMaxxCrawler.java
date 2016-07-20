package br.com.glosma.associacao.faturas.convenio.crawlers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GlosaMaxxCrawler implements Crawler {
	private static GlosaMaxxCrawler instance;
	static {
		instance = new GlosaMaxxCrawler();
	}

	public static GlosaMaxxCrawler getInstance() {
		return instance;
	}

	public List<String> obterListaDeUrlsPorPeriodo(Date periodo, String enderecoPrincipal) {
		try {
			SimpleDateFormat fm = new SimpleDateFormat("yyyyMM");

			String url = enderecoPrincipal + "index-" + fm.format(periodo) + ".html";

			Document document = Jsoup.connect(url).get();
			Elements elements = document.getElementsByAttribute("href");

			List<String> paths = new ArrayList<String>();

			for (int i = 0; i < elements.size(); i++) {
				paths.add(enderecoPrincipal + elements.get(i).attr("href"));
			}
			return paths;
		} catch (IOException e) {
			System.out.println("ERRO AO CONECTAR NO SITE DO GLOSAMAXX");
			e.printStackTrace();
		}
		return null;
	}

}
