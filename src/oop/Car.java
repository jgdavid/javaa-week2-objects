package oop;

public class Car extends Vehicle {

	public Car(String colour, int numOfWheels) {
		super(colour, numOfWheels);
		// TODO Auto-generated constructor stub
	}

	public void horn() {
		System.out.println("Beep Beep!");
	}

	@Override
	public float calculateBill() {
		// TODO Auto-generated method stub
		return 20;
	}
}
