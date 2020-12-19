import java.util.Scanner;
public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String []p= {"2400","1500","1200"};
		String []q= {"3","4","5"};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			int x=Integer.valueOf(p[i]);
			int y=Integer.valueOf(q[i]);
			sum=sum+(x*y);
		}
		System.out.println(sum);
	}

}
