package com.Keywords;

public class Key_1 extends Keywords{
	
	int f = 60;
	int g = 70;
	
	public void multi() {
		
		int h = 8;
		int i = 10;
		int j = h*i;
		
		System.out.println(super.a); //parent class reference
		System.out.println(super.b);
        System.out.println(this.f);  //current class reference
        System.out.println(this.g);
        System.out.println(j);
        System.out.println("technology :" +" "+ super.a);
	}
	
	public static void main(String[] args) {
		
		Key_1 k = new Key_1();
		k.multi();
		add();
	}
}
