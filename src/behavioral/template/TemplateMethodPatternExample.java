package behavioral.template;

public class TemplateMethodPatternExample {
	
	public static void main(String[] args) {
		FileProcessor csvProcessor = new CsvFileProcessor();
		FileProcessor jsonProcessor = new JsonFileProcessor();
		FileProcessor textProcessor = new TextFileProcessor();

		System.out.println("Processing CSV file:");
		csvProcessor.processFile("data.csv");
		System.out.println();

		System.out.println("Processing JSON file:");
		jsonProcessor.processFile("data.json");
		System.out.println();

		System.out.println("Processing Text file:");
		textProcessor.processFile("data.txt");
	}

}