package oop;

public abstract class Vehicle {
	String colour;
	int numOfWheels;
	int id;

	public Vehicle(String colour, int numOfWheels) {
		this.colour = colour;
		this.numOfWheels = numOfWheels;
	}

//	super();
//	this.colour = colour;
//	this.numOfWheels = numOfWheels;

	public abstract float calculateBill();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
