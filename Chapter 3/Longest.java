import java.util.*;
public class Longest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			String temp="";
			char ch=s.charAt(i);
			temp=temp+ch;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(j)!=ch)
					temp=temp+s.charAt(j);
				else
					break;
			}
			
			if(temp.length()>=t.length() && temp.length() != s.length())
				t=temp;
		}
		System.out.println(t);
	}
}


