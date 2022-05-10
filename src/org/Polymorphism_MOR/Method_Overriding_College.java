package org.Polymorphism_MOR;

public class Method_Overriding_College {
	
	// application form
	
	public void app_Form(String name) {
       System.out.println(name);
	}
	public void app_Form(long number, double hscpercent) {
		System.out.println(number +"  "+  hscpercent);
	}
	public void app_Form(String address, String gender) {
		System.out.println(address +"  "+  gender);
	}
	public void app_Form(String course, String dept, String bloodgroup) {
		System.out.println(course +"  "+ dept +"  "+  bloodgroup);
	}
}
