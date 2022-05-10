package org.Abstraction_Partial;

public abstract class Car_Govt_Standards {
	
	public void engine_Model() {
		System.out.println("BS6 engine");
	}
	public void safety() {
		System.out.println("Airbags");
	}
	public void insurance() {
		System.out.println("Lifetime accidental coverage");
	}
	public void cng_Kits() {
		System.out.println("20 kits");
	}
	
	public abstract void car_Name();
	public abstract void car_Colour();
	public abstract void seating_Capacity();
	public abstract void car_Type();
}
