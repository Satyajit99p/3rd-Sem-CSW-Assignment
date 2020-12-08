import java.util.*;
public class Permutation {
	public void permut(String s,String a)
	{
		if(s.length()==0)
			System.out.println(a+" ");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String s1=s.substring(0, i)+s.substring(i+1);
			permut(s1,a+ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Permutation ob=new Permutation();
		ob.permut(s, "");

	}

}
