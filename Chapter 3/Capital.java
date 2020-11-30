import java.util.Scanner;
import java.util.StringTokenizer;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb= new StringBuilder();
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			String out=s1.substring(0,1).toUpperCase()+s1.substring(1);
			sb.append(out);
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
