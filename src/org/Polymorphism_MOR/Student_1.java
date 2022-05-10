package org.Polymorphism_MOR;

public class Student_1 extends Method_Overriding_College{
	
	@Override
	public void app_Form(String name) {
		super.app_Form(name);
	}
	@Override
	public void app_Form(long number, double hscpercent) {
		super.app_Form(number, hscpercent);
	}
	@Override
	public void app_Form(String address, String gender) {
		super.app_Form(address, gender);
	}
	@Override
	public void app_Form(String course, String dept, String bloodgroup) {
		super.app_Form(course, dept, bloodgroup);
	}
	
	public static void main(String[] args) {
		
		Student_1 s1 = new Student_1();
		s1.app_Form("Suresh");
	    s1.app_Form(8428775303l, 93.45);
	    s1.app_Form("Chennai", "Male");
	    s1.app_Form("BE", "IT", "O+ve");		
	}
}
