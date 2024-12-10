package behavioral.template.e2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public abstract class WebScraper {

	// Template method to scrape a webpage
	public final void scrape(String url) {
		String pageContent = fetchPage(url);
		List<String> data = extractData(pageContent);
		processData(data);
		saveData(data);
	}

	// Concrete method: fetch the HTML content of the page using HttpURLConnection
	private String fetchPage(String url) {
		StringBuilder content = new StringBuilder();
		try {
			URL urlObj = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
			connection.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine).append("\n");
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to fetch page content");
		}
		return content.toString();
	}

	// Abstract method: extract data from the page content, to be implemented by
	// subclasses
	protected abstract List<String> extractData(String pageContent);

	// Concrete method: process the data (custom processing could be added here)
	private void processData(List<String> data) {
		System.out.println("Processing the data...");
		for (String datum : data) {
			System.out.println("Processed: " + datum);
		}
	}

	// Concrete method: save the data (in this case, print to console as an example)
	private void saveData(List<String> data) {
		System.out.println("Saving the data...");
		for (String datum : data) {
			System.out.println("Saved: " + datum);
		}
	}
}