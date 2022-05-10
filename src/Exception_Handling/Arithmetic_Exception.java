package Exception_Handling;

public class Arithmetic_Exception {
	
	public static void main(String[] args) {
	
		int a = 10;
		
		int b = 0;
		
		int c = 0;
		
		try {
			c = a/b;
		} catch (Exception e) { 
			
//If you have multiple exceptions in one program can mention that exception name in catch block ( "Here" Exception e)
			
			//But cannot keep this format (Exception e) ahead of all the other exceptions - multiple case
			
			System.err.println("Arithmetic Exception Occured");
		}		
		finally {
			System.out.println("End of Program");
		}
		
		System.out.println(c);		
	}
}
