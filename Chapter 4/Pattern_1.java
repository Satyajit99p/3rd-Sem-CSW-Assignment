import java.util.*;
import java.util.regex.Pattern;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Flight KB879. is coming";
		String s2=".*KB\\d+\\..*";
		System.out.println(Pattern.matches(s2, s1));
		
		String s3="pqr abd pxy";
		String s4=".*abd.*";
		System.out.println(Pattern.matches(s4,s3));
		

	}

}
