package behavioral.template;

public class CsvFileProcessor extends FileProcessor {

	@Override
	protected void parseFile() {
		System.out.println("Parsing CSV file...");
		// Specific logic for parsing CSV files (e.g., splitting by commas)
	}

	@Override
	protected void processData() {
		System.out.println("Processing data from CSV...");
		// Logic to process parsed CSV data
	}

}