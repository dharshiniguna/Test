package org.Abstraction_Full;

public class Interface2 implements Interface1 {

	@Override
	public void course_Name() {
		System.out.println("Java-Selenium");	
	}

	@Override
	public void course_Value() {
		System.out.println("20000");		
	}

	@Override
	public void duration() {
		System.out.println("3 months");		
	}

	@Override
	public void trainee_Name() {
		System.out.println("Jagan");		
	}
	
	public static void main(String[] args) {
		
		Interface2 i = new Interface2();
		i.course_Name();
		i.course_Value();
		i.duration();
		i.trainee_Name();
	}
}
