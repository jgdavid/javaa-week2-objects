package java_week2_objects;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public boolean method(String colour) {
		for (Vehicle v : vehicles) {
			if (v.colour.equalsIgnoreCase(colour))
				;
			return true;

		}

		return false;

	}

}
