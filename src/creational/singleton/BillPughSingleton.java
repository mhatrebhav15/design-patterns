package creational.singleton;

public class BillPughSingleton {

	// Step 1: Private static inner static class to hold the Singleton instance
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		// This will be loaded only when it is referenced
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	// Step 2: Public method to provide access to the instance
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	// Example method to show functionality
	public void showMessage() {
		System.out.println("Hello, this is the Singleton instance!");
	}

}
