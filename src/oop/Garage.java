package oop;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public List<Vehicle> vehicles = new ArrayList<Vehicle>();

	private int count = 0;

	public boolean addVehicle(Vehicle v) {
		v.setId(count++);
		return this.vehicles.add(v);

	}

	public boolean emptyGarage() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}

	public boolean Colour(String colour) {
		for (Vehicle v : vehicles) {
			if (v.colour.equalsIgnoreCase(colour))
				;
			return true;
		}

		return false;
	}

//	public boolean removeById(int id) {
//		for (Vehicle v : vehicles) {
//			if (v.id == id)
//				vehicles.remove(v);
//			return true;
//		}
//		return false;
//	}

	public boolean removeById(int id) {
		for (Vehicle v : this.vehicles) {
			if (v.id == id) {
				return this.removeVehicle(v);
			}
		}
		return false;

	}

	private boolean removeVehicle(Vehicle vehicle) {

		return this.vehicles.remove(vehicle);
	}

	public int vehiclesInGarage() {
		for (int i = 0; i < vehicles.size(); i++) {

		}
		return vehicles.size();

	}

	public int calculateBill() {
		int bill = 0;
		for (Vehicle v : this.vehicles)
			bill += v.calculateBill();
		return bill;
	}

	public void removeByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type))
				toRemove.add(v);
		}
		this.vehicles.removeAll(toRemove);
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

}
