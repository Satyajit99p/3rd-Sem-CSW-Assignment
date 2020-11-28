import java.util.Scanner;
class factorial 
{
	public static void factorial(int x)
	{
		int f=1;
		for (int i=1;i<=x;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}
}
public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		factorial ob=new factorial();
		ob.factorial(x);

	}

}
