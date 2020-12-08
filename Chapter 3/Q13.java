import  java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String regex=".*(world).*";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		while(m.find())
		{
			if(m.matches())
				System.out.println(m.start());
			else
				System.out.println("-1");
		}
	
	}

}
