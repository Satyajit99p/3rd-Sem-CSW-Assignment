import java.util.*;
import java.util.regex.*;
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r="\\d+";
		String max="0";
		Pattern p=Pattern.compile(r);
		Matcher m=p.matcher(s);
		while(m.find())
		{
			
			if((m.group().compareTo(max)>=0))
				max=m.group();
		}
		System.out.println(max);
	}

}
