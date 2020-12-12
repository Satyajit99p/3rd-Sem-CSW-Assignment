import java.util.regex.*;
import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p=Pattern.compile(".s"); //creating a pattern by calling compile method
		Matcher m=p.matcher("as"); //request a matcher from the pattern
		boolean b1=m.matches();
		System.out.println(b1);
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
	
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b3);
	}
}
