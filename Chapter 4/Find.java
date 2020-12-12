import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is my book. i like to read book";
		String s2="book";
		Pattern p=Pattern.compile(s2);
		Matcher m=p.matcher(s1);
		while(m.find())
		{
			System.out.println("ppattern found from "+m.start()+" to "+(m.end()-1));
		}

	}

}
