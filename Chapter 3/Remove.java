import java.util.*;
public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		char ch=sc.next().charAt(0);
		for(int i=0;i<sb.length();i++)
		{
			if(ch==sb.charAt(i))
				sb.deleteCharAt(i);
		}
		System.out.println(sb);
	}

}
