package structural.facade;

// Facade
class HomeTheaterFacade {

	private DVDPlayer dvdPlayer;
	private Projector projector;
	private SoundSystem soundSystem;
	private Lights lights;

	public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.soundSystem = soundSystem;
		this.lights = lights;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		lights.dim(10); // Dimming lights
		projector.on(); // Turning on the projector
		projector.setWideScreenMode(); // Setting projector to widescreen mode
		soundSystem.on(); // Turning on the sound system
		soundSystem.setVolume(5); // Setting volume to a moderate level
		dvdPlayer.on(); // Turning on the DVD player
		dvdPlayer.play(movie); // Playing the movie
	}

	public void endMovie() {
		System.out.println("\nShutting down movie theater...");
		lights.on(); // Turning lights back on
		projector.off(); // Turning off the projector
		soundSystem.off(); // Turning off the sound system
		dvdPlayer.stop(); // Stopping the DVD player
		dvdPlayer.off(); // Turning off the DVD player
	}

}
