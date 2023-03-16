package oop;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public boolean Colour(String colour) {
		for (Vehicle v : vehicles) {
			if (v.colour.equalsIgnoreCase(colour))
				;
			return true;
		}

		return false;
	}

	public boolean method1(int id) {
		for (Vehicle v : vehicles) {
			if (v.id == id)
				vehicles.remove(v);
			return true;
		}
		return false;
	}

	public int method2() {
		for (int i = 0; i < vehicles.size(); i++) {

		}
		return vehicles.size();

	}
}
