package structural.facade;

public class SoundSystem {

	public void on() {
		System.out.println("Sound system is On");
	}

	public void setVolume(int level) {
		System.out.println("Setting volume to: " + level);
	}

	public void off() {
		System.out.println("Sound system is Off");
	}

}