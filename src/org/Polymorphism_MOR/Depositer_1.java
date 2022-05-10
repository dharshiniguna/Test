package org.Polymorphism_MOR;

public class Depositer_1 extends Bank_Details_MOR{
	
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
		
		Depositer_1 d1 = new Depositer_1();
		d1.deposit_Challan("Rajesh");
		d1.deposit_Challan("SBI", "Chrompet");
		d1.deposit_Challan(2033102087, 15000);
		d1.deposit_Challan("Fifteen Thousand rupees only", 9876543210l);
	}
}
