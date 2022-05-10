package org.Polymorphism_MOL;

public class Bank_Details_MOL {
	
	private void bank_Details(String Account_Holder_Name, String Bank_Name) {
		 System.out.println(Account_Holder_Name);
		 System.out.println(Bank_Name);
    }
	 private void bank_Details(String Account_Type, String Branch_Name, long Account_Number) {
        System.out.println(Account_Type);
        System.out.println(Branch_Name);
        System.out.println(Account_Number);
	}
	 private void bank_Details(String IFSC_Code, int Pincode) {
        System.out.println(IFSC_Code);
        System.out.println(Pincode);
	}
	 private void bank_Details(String Bank_Location, long Contact_Num) {
        System.out.println(Bank_Location);
        System.out.println(Contact_Num);
	}
	 
	 public static void main(String[] args) {
		
		 Bank_Details_MOL b = new Bank_Details_MOL();
		 b.bank_Details("Deepak M", "HDFC bank");
		 b.bank_Details("Savings Account", "Ashok Nagar Branch", 20351032976l);
		 b.bank_Details("HDFC0000123",8056913952l);
		 b.bank_Details("Chennai", 600012);
	}
}
