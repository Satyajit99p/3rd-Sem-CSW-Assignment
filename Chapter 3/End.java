import java.util.*;
public class End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s= sc.nextLine();
		String t="";
		StringBuilder sb=new StringBuilder(s);
		char ar[]=s.toCharArray();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=ar[i];
			if(ch>=65 && ch<=90)
			{
				sb.deleteCharAt(i-c);
				t=t+ch;
				c++;
			}	
			
		}
		System.out.println(sb);
		System.out.println(sb+" "+t);

	}

}
