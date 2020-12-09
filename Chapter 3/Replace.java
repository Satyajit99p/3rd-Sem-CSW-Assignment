import java.util.*;
public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch='\t';
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			
			if(x==' ')
				s=s.replace( x, ch);
		}
		System.out.println(s);
	}

}
