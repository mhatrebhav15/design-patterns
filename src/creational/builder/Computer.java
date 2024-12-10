package creational.builder;

public class Computer {
	private String CPU;
	private String RAM;
	private String storage;
	private String GPU;
	private boolean isBluetoothEnabled;

	// Private constructor to enforce object creation through Builder
	private Computer(ComputerBuilder builder) {
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
		this.GPU = builder.GPU;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + ", GPU=" + GPU + ", Bluetooth="
				+ (isBluetoothEnabled ? "Enabled" : "Disabled") + "]";
	}

	// Static Builder class
	public static class ComputerBuilder {
		private String CPU;
		private String RAM;
		private String storage;
		private String GPU;
		private boolean isBluetoothEnabled;

		// Setter methods that return the builder itself for method chaining
		public ComputerBuilder setCPU(String CPU) {
			this.CPU = CPU;
			return this;
		}

		public ComputerBuilder setRAM(String RAM) {
			this.RAM = RAM;
			return this;
		}

		public ComputerBuilder setStorage(String storage) {
			this.storage = storage;
			return this;
		}

		public ComputerBuilder setGPU(String GPU) {
			this.GPU = GPU;
			return this;
		}

		public ComputerBuilder enableBluetooth(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		// Method to build and return the Computer object
		public Computer build() {
			return new Computer(this);
		}
	}
}
