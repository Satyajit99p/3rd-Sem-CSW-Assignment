import java.util.Scanner;
import java.util.StringTokenizer; 
public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s,":");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
