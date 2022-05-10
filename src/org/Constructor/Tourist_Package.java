package org.Constructor;

public class Tourist_Package {
	
	//non parameterized constructor
	
	public Tourist_Package() {
      System.out.println("Kerala Trip Details");
	}
    
	// parameterized constructor
	
	public Tourist_Package(String location1 , String location2) {
	      System.out.println(location1 +"  "+ location2);
		}
	public Tourist_Package(int cost , String vehicleType) {
	      System.out.println(cost +"  "+ vehicleType);
		}
	public Tourist_Package(long cont_num , String daysOfTravel , int total_Numbers) {
	      System.out.println(cont_num +"  "+ daysOfTravel +"  "+ total_Numbers);
		}
	public static void main(String[] args) {
		
		Tourist_Package t = new Tourist_Package();
		Tourist_Package t1 = new Tourist_Package("Wayanad", "Munnar");
		Tourist_Package t2 = new Tourist_Package(10000, "Minibus");
		Tourist_Package t3 = new Tourist_Package(8765431234l, "1 week" , 10);
	}
}
