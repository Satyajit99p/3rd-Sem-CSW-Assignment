import java.util.*;
public class Only_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch <= '9')
			{
				System.out.println("true");
				break;
			}
				
			else
			{
				System.out.println("false");
				break;
			}
				
		}
		
	}

}
