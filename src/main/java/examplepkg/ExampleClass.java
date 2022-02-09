package examplepkg;

import java.util.ArrayList;
import java.util.List;

public class ExampleClass {

	public static void myMain() {
		List<String> ll = new ArrayList<String>();
		ll.add("Grand Total:19500.0");
		
		String str = "rahul";
		if(ll.contains("Grand Total")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		if(str.contains("ah")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
