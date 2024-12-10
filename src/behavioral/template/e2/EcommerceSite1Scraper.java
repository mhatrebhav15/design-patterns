package behavioral.template.e2;

import java.util.ArrayList;
import java.util.List;

public class EcommerceSite1Scraper extends WebScraper {

	@Override
	protected List<String> extractData(String pageContent) {
		System.out.println("Extracting product prices from Website 1...");
		List<String> prices = new ArrayList<>();
		String[] lines = pageContent.split("\n");
		for (String line : lines) {
			if (line.contains("<span class=\"price\">")) {
				int start = line.indexOf("<span class=\"price\">") + "<span class=\"price\">".length();
				int end = line.indexOf("</span>", start);
				if (start != -1 && end != -1) {
					prices.add(line.substring(start, end).trim());
				}
			}
		}
		return prices;
	}
}