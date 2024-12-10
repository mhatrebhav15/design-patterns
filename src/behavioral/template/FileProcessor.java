package behavioral.template;

public abstract class FileProcessor {

	// Template method defining the steps for processing a file
	public final void processFile(String fileName) {
		openFile(fileName);
		readFile();
		parseFile();
		processData();
		closeFile();
	}

	// Concrete methods - common steps for all file types
	private void openFile(String fileName) {
		System.out.println("Opening file: " + fileName);
	}

	private void readFile() {
		System.out.println("Reading file content...");
	}

	private void closeFile() {
		System.out.println("Closing file.");
	}

	// Abstract methods - steps that will be customized by subclasses
	protected abstract void parseFile();

	protected abstract void processData();

}