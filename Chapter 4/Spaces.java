import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//StringBuilder sb=new StringBuilder(s);
		String p1=" ";		
		Pattern p=Pattern.compile(p1);
		Matcher m=p.matcher(s);
		System.out.println(m.replaceAll(""));
	}
}
