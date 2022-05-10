package org.Abstraction_Partial;

public abstract class Trailer {
	
	//non-abstract method
	
	public void movieName() {
		System.out.println("Valimai");
	}
	public void hero() {
		System.out.println("Ajith");
	}
	public void director() {
	    System.out.println("Vinoth");
    }
	public void music() {
		System.out.println("Yuvan");
	}
	
	//abstract method
	
	public abstract void story();
	public abstract void guestRole();
	public abstract void songs();
}
