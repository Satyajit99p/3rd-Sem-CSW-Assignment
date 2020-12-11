import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder s1=new StringBuilder();
		StringTokenizer st=new StringTokenizer(s,", |",true);
		while(st.hasMoreElements())
		{
			
			String y=(String)st.nextElement();
			if(y.equals(",") || y.contentEquals(" ") || y.contentEquals("|"))
				s1.append(y);
		}
		System.out.println(s1);
	}

}
