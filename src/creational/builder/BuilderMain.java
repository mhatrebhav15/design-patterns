package creational.builder;

public class BuilderMain {
	
    public static void main(String[] args) {
        // Using the builder pattern to create different Computer configurations
        Computer gamingComputer = new Computer.ComputerBuilder()
            .setCPU("Intel Core i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA RTX 3080")
            .enableBluetooth(true)
            .build();

        Computer officeComputer = new Computer.ComputerBuilder()
            .setCPU("Intel Core i5")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .setGPU("Integrated Graphics")
            .enableBluetooth(false)
            .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }

}
