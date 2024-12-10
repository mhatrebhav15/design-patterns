package behavioral.template.e2;

public class WebScrapingMultipleSites {

	public static void main(String[] args) {
		WebScraper site1Scraper = new EcommerceSite1Scraper();
		WebScraper site2Scraper = new EcommerceSite2Scraper();
		WebScraper site3Scraper = new EcommerceSite3Scraper();

		// Scrape product prices from E-Commerce Site 1
		System.out.println("\nScraping Product Prices from E-Commerce Site 1:");
		site1Scraper.scrape("https://example-site1.com/products");

		// Scrape product prices from E-Commerce Site 2
		System.out.println("\nScraping Product Prices from E-Commerce Site 2:");
		site2Scraper.scrape("https://example-site2.com/products");

		// Scrape product prices from E-Commerce Site 3
		System.out.println("\nScraping Product Prices from E-Commerce Site 3:");
		site3Scraper.scrape("https://example-site3.com/products");
	}
}
