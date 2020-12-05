import java.util.Scanner;
import java.util.StringTokenizer;

public class Delims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0,d=0;
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreElements())
		{
			String ch=(String) st.nextElement();
			d++;
			
		}
		System.out.println("no of tokens : "+d);
		System.out.println("no.of delimiters : "+(d-1));
	}

}
