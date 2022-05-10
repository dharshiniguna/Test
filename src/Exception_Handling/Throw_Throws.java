package Exception_Handling;

import java.util.InputMismatchException;

public class Throw_Throws {
	
	public static void validate(int age) throws Exception {
		
		if (age>=18) {
			
			System.out.println("Eligible for Vote");
			
		} else {

//			System.out.println("Not eligible for vote");
			
			throw new InputMismatchException("Not eligible for vote");
		}
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		validate(17);
	}
}
