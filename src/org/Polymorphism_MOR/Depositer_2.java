package org.Polymorphism_MOR;

public class Depositer_2 extends Bank_Details_MOR{
	
	@Override
	public void deposit_Challan(String acnt_holder_name) {
		super.deposit_Challan(acnt_holder_name);
	}
	@Override
	public void deposit_Challan(String bank_name, String branch) {
		super.deposit_Challan(bank_name, branch);
	}
	@Override
	public void deposit_Challan(int acnt_num, int amount) {
		super.deposit_Challan(acnt_num, amount);
	}
	@Override
	public void deposit_Challan(String amount_in_words, long contact_num) {
		super.deposit_Challan(amount_in_words, contact_num);
	}
	public static void main(String[] args) {
		
		Depositer_2 d2 = new Depositer_2();
		d2.deposit_Challan("Priya");
		d2.deposit_Challan("HDFC", "Adyar");
		d2.deposit_Challan(2107654321, 10000);
		d2.deposit_Challan("Ten Thousand rupees only", 8976545320l);
	}
}
