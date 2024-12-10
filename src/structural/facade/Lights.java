package structural.facade;

public class Lights {
	
	public void dim(int level) {
		System.out.println("Dimming lights to: " + level + "%");
	}

	public void on() {
		System.out.println("Lights are On");
	}

}