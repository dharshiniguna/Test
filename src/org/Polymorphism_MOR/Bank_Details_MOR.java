package org.Polymorphism_MOR;

public class Bank_Details_MOR {
	
	public void deposit_Challan(String acnt_holder_name) {
       System.out.println(acnt_holder_name);
	}
	public void deposit_Challan(String bank_name, String branch) {
       System.out.println(bank_name +"  "+ branch);
	}
	public void deposit_Challan(int acnt_num, int amount) {
        System.out.println(acnt_num);
    	System.out.println(amount);
    }
	public void deposit_Challan(String amount_in_words,long contact_num) {
		System.out.println(amount_in_words);
		System.out.println(contact_num);
	}
}
