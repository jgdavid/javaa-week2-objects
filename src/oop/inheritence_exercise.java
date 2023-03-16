package oop;

public class inheritence_exercise {
	public static void main(String[] args) {
		Car c = new Car("green", 4);

		Pushbike b = new Pushbike("Blue", 2);

		Motorbike m = new Motorbike("Red", 2);

		Garage garage = new Garage();
		garage.vehicles.add(c);
		garage.vehicles.add(b);
		garage.vehicles.add(m);

		System.out.println(garage.Colour("Blue"));
		System.out.println(m.numOfWheels);
		System.out.println(m.id);
		System.out.println(garage.vehiclesInGarage());
		System.out.println(garage.vehiclesInGarage());
		System.out.println(garage.calculateBill());
		garage.removeByType("car");
		System.out.println(garage.vehiclesInGarage());
		System.out.println("car");
	}

}
