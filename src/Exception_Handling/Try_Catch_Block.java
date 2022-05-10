package Exception_Handling;

public class Try_Catch_Block {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 0;
		
		int c = 0;
		
		try {
			int arr [] = null;   // within try multiple errors, considers only first error and rest are ignored
			System.out.println(arr [1]);
			
			c = a/b;
		} 
//		catch (Exception e) {
//			System.err.println("Exception Occured");
//		}
		catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception Occured");
		}
		catch (NullPointerException e) {
			System.err.println("Null Pointer Exception Occured");
		}
		
		finally {
			System.out.println("Rest of program");
		}
		System.out.println(c);
		
	}
}
