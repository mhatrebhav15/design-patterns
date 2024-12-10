package creational.singleton;

public class Singleton {

	// Step 1: Create a private static instance of the class (initially null)
	private static volatile Singleton instance;

	// Step 2: Private constructor to prevent external instantiation
	private Singleton() {
	}

	// Step 3: Public method to provide access to the instance
	public static Singleton getInstance() {
		if (instance == null) { // First check
			synchronized (Singleton.class) {
				if (instance == null) { // Second check
					instance = new Singleton(); // Create the instance
				}
			}
		}
		return instance;
	}

	// Example method to show functionality
	public void showMessage() {
		System.out.println("Hello, this is the Singleton instance!");
	}

}
