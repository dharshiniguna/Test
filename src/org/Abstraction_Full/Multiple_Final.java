package org.Abstraction_Full;

public class Multiple_Final implements Multiple_Inheritance1 , Multiple_Inheritance2 {

@Override
public void college_Name() {
	System.out.println("Anna University");
}

@Override
public void course_Name() {
	System.out.println("Apparel technology");	
}

@Override
public void department() {
	System.out.println("Textile Department");
}

@Override
public void total_Students() {
	System.out.println("25 students");	
}

@Override
public void total_Fees() {
	System.out.println("Rs: 1.5 LPA");	
}

@Override
public void hostel_Name() {
	System.out.println("Cauvery");	
}

@Override
public void food_Type() {
    System.out.println("Both veg and non-veg");	
}

@Override
public void rooms_Vacant() {
    System.out.println("15 vacant");
}

@Override
public void total_Rooms() {
	System.out.println("50 rooms");	
}
public static void main(String[] args) {
	
	Multiple_Final m = new Multiple_Final();
	m.college_Name();
	m.course_Name();
	m.department();
	m.total_Students();
	m.total_Fees();
	m.hostel_Name();
	m.food_Type();
	m.total_Rooms();
	m.rooms_Vacant();
}
}
