package creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		// We don't know which vehicle we will need, but we can call the factory to
		// create it.

		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.createVehicle();
		car.drive(); // Output: Driving a Car!

		VehicleFactory bikeFactory = new BikeFactory();
		Vehicle bike = bikeFactory.createVehicle();
		bike.drive(); // Output: Riding a Bike!

		VehicleFactory truckFactory = new TruckFactory();
		Vehicle truck = truckFactory.createVehicle();
		truck.drive(); // Output: Driving a Truck!
	}

}
