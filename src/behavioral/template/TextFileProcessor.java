package behavioral.template;

public class TextFileProcessor extends FileProcessor {

	@Override
	protected void parseFile() {
		System.out.println("Parsing text file...");
		// Specific logic for parsing a text file (e.g., line by line)
	}

	@Override
	protected void processData() {
		System.out.println("Processing data from Text file...");
		// Logic to process parsed text data
	}

}