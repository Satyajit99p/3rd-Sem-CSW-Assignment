import java.util.*;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches("a+", "aaa"));
		System.out.println(Pattern.matches("a+", "bc"));
		System.out.println(Pattern.matches("a+", "a"));
		System.out.println(Pattern.matches("a+b+c+", "aabbcc"));
		System.out.println();
		System.out.println(Pattern.matches("a+?", "aaa"));
		System.out.println(Pattern.matches("a+?", "bc"));
		System.out.println(Pattern.matches("a+?", "a"));
		System.out.println(Pattern.matches("a+?b+?c+?", "abcabc"));
		System.out.println();
		System.out.println(Pattern.matches("a++", "aaa"));
		System.out.println(Pattern.matches("a++", "bc"));
		System.out.println(Pattern.matches("a++", "a"));
		System.out.println(Pattern.matches("a++b++c++", "aaaabbccc"));
	}

}
