package org.Abstraction_Partial;

public class Car_Details extends Car_Govt_Standards{

	@Override
	public void car_Name() {
		System.out.println("Tata Etios");		
	}

	@Override
	public void car_Colour() {
		System.out.println("White");		
	}

	@Override
	public void seating_Capacity() {
		System.out.println("5 seater");		
	}

	@Override
	public void car_Type() {
		System.out.println("Sedan");		
	}

	public static void main(String[] args) {
		
		Car_Details c = new Car_Details();
		c.car_Name();
		c.car_Colour();
		c.car_Type();
		c.seating_Capacity();
		c.engine_Model();
		c.safety();
		c.insurance();
		c.cng_Kits();
	}
}
