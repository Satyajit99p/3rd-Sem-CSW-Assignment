import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Phone_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String input = sc.next();
		String regex="(\\d{3})(\\d{3})(\\d+)";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		if(m.matches())
		{
		String number = input.replaceAll("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		System.out.println(number);
		}
	}
		
	}

