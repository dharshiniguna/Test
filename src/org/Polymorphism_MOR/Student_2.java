package org.Polymorphism_MOR;

public class Student_2 extends Method_Overriding_College{
	
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
    	
    	Student_2 s2 = new Student_2();
		s2.app_Form("Anita");
	    s2.app_Form(8428774567l, 90.5);
	    s2.app_Form("Bangalore", "Female");
	    s2.app_Form("Btech", "CS", "B+ve");		
	}
	}
