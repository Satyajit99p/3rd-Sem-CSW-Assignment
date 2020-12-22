import java.util.*;
import java.util.regex.Pattern;
public class Numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String regex="[0-9]+";
		String[] ar=s.split(" ");
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			
			if(Pattern.matches(regex, ar[i]))
			{
				Integer x=new Integer(ar[i]);
				
				sum=sum+x;
			}
		}
		System.out.println(sum);
	}

}
