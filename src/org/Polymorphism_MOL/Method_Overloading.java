package org.Polymorphism_MOL;

public class Method_Overloading {
	
	public void show_Room(String brandname) {
	    System.out.println(brandname);
		}
		
		public void show_Room(String model, String place) {
	    System.out.println(model);
	    System.out.println(place);
		}
		
		public void show_Room(int manufacturer_year, long contact_num) {
	    System.out.println(manufacturer_year +"   "+ contact_num);
		}
		
	public static void main(String[] args) {
		
		Method_Overloading m = new Method_Overloading();
		m.show_Room("HP");
		m.show_Room("Aspire", "Chennai");
		m.show_Room(2019, 8428775303l);
	}
}
