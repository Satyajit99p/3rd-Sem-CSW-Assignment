import java.util.Scanner;
public class Program_3 {

	public static boolean prime(int x)
	{
		for (int i=2;i<x;i++)
		{
			if(x%i==0)
				return false;
			else
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Program_3 ob=new Program_3();
		if(ob.prime(x))
			System.out.println("it is prime");
		else
			System.out.println("it is not prime");
	}

}
