package creational.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// Get the only instance of Singleton
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
	}

}
