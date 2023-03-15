package java_week2_objects;

public class inheritence_exercise {
	public static void main(String[] args) {
		Car c = new Car();
		c.setColour("Green");
		c.setNumOfWheels(2);
		c.setId(1);

		Pushbike b = new Pushbike();
		b.setColour("Blue");
		b.setNumOfWheels(2);
		b.setId(2);

		Motorbike m = new Motorbike();
		m.setColour("Red");
		m.setNumOfWheels(2);
		m.setId(3);

		Garage garage = new Garage();
		garage.vehicles.add(c);
		garage.vehicles.add(b);
		garage.vehicles.add(m);

		System.out.println(garage.method("Blue"));
		System.out.println(b.colour);
		System.out.println(c.colour);
		System.out.println(m.colour);
		System.out.println(m.numOfWheels);
		System.out.println(m.id);
		System.out.println(garage.method2());
		System.out.println(garage.method1(1));
		System.out.println(garage.method2());
	}
}
