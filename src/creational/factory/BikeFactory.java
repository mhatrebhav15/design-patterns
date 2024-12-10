package creational.factory;

public class BikeFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}
}
