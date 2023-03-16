package oop;

public class Pushbike extends Vehicle {
	public Pushbike(String colour, int numOfWheels) {
		super(colour, numOfWheels);
		// TODO Auto-generated constructor stub
	}

	public void pedals() {

	}

	@Override
	public float calculateBill() {
		// TODO Auto-generated method stub
		return 45;
	}
}
