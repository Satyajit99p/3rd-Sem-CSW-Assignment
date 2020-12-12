import java.util.*;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abc123@";
		String s2="^[a-zA-Z0-9_-]+(:\\."+
		"[a-zA-Z0-9_+&*-]+)*@";
		if(Pattern.matches(s2, s1))
			System.out.println("valid email");
		else
			System.out.println("invalid email");

	}

}
