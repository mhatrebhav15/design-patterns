package behavioral.template;

public class JsonFileProcessor extends FileProcessor {

	@Override
	protected void parseFile() {
		System.out.println("Parsing JSON file...");
		// Specific logic for parsing JSON files (e.g., using a JSON library)
	}

	@Override
	protected void processData() {
		System.out.println("Processing data from JSON...");
		// Logic to process parsed JSON data
	}

}