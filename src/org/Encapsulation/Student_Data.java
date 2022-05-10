package org.Encapsulation;

public class Student_Data {
	
	private void student_Name() {
		System.out.println("Student Name: Priya");
    }
	private void studentClass() {
        System.out.println("Class: 10th Standard");
    }
	private void dob() {
        System.out.println("Date of Birth: 20-11-1996");
    }
	private void marksObtained() {
        System.out.println("Total Marks: 469/500");
    }
	private void percentageScored() {
    	System.out.println("Percentage: 93%");
    }
    public static void main(String[] args) {
		//classname refname = new classname();
    	Student_Data info = new Student_Data();
    	info.student_Name();
    	info.studentClass();
    	info.dob();
    	info.marksObtained();
    	info.percentageScored();
	}
}
