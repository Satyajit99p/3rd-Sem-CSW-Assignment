import java.util.Scanner;
public class Replace_tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=' ';
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			
			if(x=='\t')
				s=s.replace( x, ch);
		}
		System.out.println(s);
	}

}
