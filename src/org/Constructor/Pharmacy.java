package org.Constructor;

public class Pharmacy {
	
	public Pharmacy() {
       System.out.println("Medicine Details");
	}
	public Pharmacy(String tablet_Name , String medicine_Type) {
	       System.out.println(tablet_Name);
	       System.out.println(medicine_Type);
	}
	public Pharmacy(String symptoms, int cost_Of_Onebox) {
	       System.out.println(symptoms);
	       System.out.println(cost_Of_Onebox);
	}
	public Pharmacy(String mfg_Month , int mfg_Year , String exp_Month , int exp_Year) {
	       System.out.println(mfg_Month +""+ mfg_Year);
	       System.out.println(exp_Month +""+ exp_Year);
	}
	
	public static void main(String[] args) {
		
		Pharmacy p = new Pharmacy();
		Pharmacy p1 = new Pharmacy("Cetrizine", "Anti-Allergic Medicine");
		Pharmacy p2 = new Pharmacy("Cold,Sneezing", 1200);
		Pharmacy p3 = new Pharmacy("Mfg.Jan", 2022,"Exp.Feb", 2024);
	}
}
