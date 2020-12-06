import java.util.Scanner;
public class Non_Repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int x=s.length();
		for(int i=0;i<s.length();i++)
		{
			x=x-1;
			int c=0;
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				if(ch==s.charAt(j))
					break;
				else
					c++;
			}
			if(c==x)
			{
				System.out.println(ch);
				break;
			}	
		}

	}

}
