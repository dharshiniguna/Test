package org.Inheritance_Multilevel;

public class Child extends Father{
	
	public void property6() {
		System.out.println("Bike");
	}
    public static void main(String[] args) {
	Child c = new Child();
	c.property1();
	c.property2();
	c.property3();
	c.property4();
	c.property5();
	c.property6();
    }
}
