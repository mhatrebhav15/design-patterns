package behavioral.template.e2;

import java.util.ArrayList;
import java.util.List;

public class EcommerceSite2Scraper extends WebScraper {

	@Override
	protected List<String> extractData(String pageContent) {
		System.out.println("Extracting product prices from Website 2...");
		List<String> prices = new ArrayList<>();
		String[] lines = pageContent.split("\n");
		for (String line : lines) {
			if (line.contains("<p class=\"product-price\">")) {
				int start = line.indexOf("<p class=\"product-price\">") + "<p class=\"product-price\">".length();
				int end = line.indexOf("</p>", start);
				if (start != -1 && end != -1) {
					prices.add(line.substring(start, end).trim());
				}
			}
		}
		return prices;
	}

}