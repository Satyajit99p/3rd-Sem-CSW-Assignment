import java.util.*;
public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int max=0;
		char x = 0;
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
					c++;
			}
			if(c>max)
			{
				max=c;
				x=ch;
			}	
		}
		
		System.out.println(x);
	}

}
