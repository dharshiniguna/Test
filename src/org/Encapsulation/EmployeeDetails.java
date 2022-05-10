package org.Encapsulation;

public class EmployeeDetails {
	
	private void employee_Name() {
		System.out.println("Employee Name: Rohan");
    }
	private void age() {
        System.out.println("Age: 27");
    }
	private void dob() {
        System.out.println("Date of Birth: 20-11-1993");
    }
	private void jobRole() {
        System.out.println("Job Role: Consultant");
    }
	private void companyName() {
    	System.out.println("Company Name: Virtusa");
    }
	private void joiningDate() {
    	System.out.println("Joining Date: 14-02-2022");
    }
	private void ctcOffered() {
    	System.out.println("CTC offered: 10.5 LPA");
    }
	private void placeOfJoining() {
    	System.out.println("Work Location: Chennai");
    }
    public static void main(String[] args) {
		//classname refname = new classname();
    	EmployeeDetails data = new EmployeeDetails();
    	data.employee_Name();
    	data.age();
    	data.dob();
    	data.jobRole();
    	data.companyName();
    	data.joiningDate();
    	data.ctcOffered();
    	data.placeOfJoining();
     }
}
