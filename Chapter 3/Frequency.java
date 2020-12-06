import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int x=s.length();
		char ar[]=new char[x];
		for(int i=0;i<x;i++)
			ar[i] = s.charAt(i);
		for(int i=0;i<x;i++)
		{
			int c=0;
			for(int j=0;j<x;j++)
			{
				if(ar[i]==ar[j])
					c++;
			}
			System.out.println(ar[i]+" : "+c);
		}
	}

}
