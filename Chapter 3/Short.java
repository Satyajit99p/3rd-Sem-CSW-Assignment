import java.util.Scanner;
import java.util.StringTokenizer;

public class Short {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		String temp="";
		String s2="";
		String s1="";
		while(st.hasMoreTokens())
		{
			 s1=st.nextToken();
			temp=temp+s1.substring(0,1).toUpperCase();
		}
		s2=s1.substring(0,1).toUpperCase()+s1.substring(1);
		String t="";
		for(int j=0;j<temp.length()-1;j++)
		{
			t=t+temp.charAt(j)+".";
		}
		System.out.println(t+s2);
	}

}
