package behavioral.template.e2;

import java.util.ArrayList;
import java.util.List;

public class EcommerceSite3Scraper extends WebScraper {

	@Override
	protected List<String> extractData(String pageContent) {
		System.out.println("Extracting product prices from Website 3...");
		List<String> prices = new ArrayList<>();
		String[] lines = pageContent.split("\n");
		for (String line : lines) {
			if (line.contains("<div class=\"product-price-tag\">")) {
				int start = line.indexOf("<div class=\"product-price-tag\">")
						+ "<div class=\"product-price-tag\">".length();
				int end = line.indexOf("</div>", start);
				if (start != -1 && end != -1) {
					prices.add(line.substring(start, end).trim());
				}
			}
		}
		return prices;
	}

}