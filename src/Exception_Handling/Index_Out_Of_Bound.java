package Exception_Handling;

import java.util.ArrayList;
import java.util.List;

public class Index_Out_Of_Bound {

	public static void main(String[] args) {
		
		List <Object> obj = new ArrayList <Object> ();
		
		obj.add(10);
		obj.add(20);
		
		Object object = null;
		try {
			object = obj.get(2);
		} 
		
		catch (Exception e) {
			System.err.println("Index Out Of Bound Exception occured");
		}
		System.out.println(object);	
	}
}
