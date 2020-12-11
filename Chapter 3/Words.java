import java.util.Scanner;
import java.util.StringTokenizer;
public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		int c=0;
		while(st.hasMoreTokens())
		{
			c++;
			st.nextToken();
		}
		System.out.println("no.of words : "+c);

	}

}
