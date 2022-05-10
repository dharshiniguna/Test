package Exception_Handling;

public class Number_Format_Exception {
	
	public static void main(String[] args) {
		
		String s = "123abc";
		
		int i = 0;
		
		try {
			i = Integer.parseInt(s);
		} 
		
		catch (NumberFormatException e) {
			System.err.println("Number Format Exception Occured");
		}
		
		int a = 100;
		
		System.out.println(i+a);
	}
}
