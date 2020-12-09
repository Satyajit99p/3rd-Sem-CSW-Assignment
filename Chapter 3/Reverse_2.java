import java.util.*;
public class Reverse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		String temp="";
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			StringBuilder sb=new StringBuilder(s1);
			temp=temp+sb.reverse()+" ";
		}
		System.out.println(temp);

	}

}
