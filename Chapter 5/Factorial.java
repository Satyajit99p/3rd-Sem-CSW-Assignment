import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=x;i++)
			fact=fact.multiply(BigInteger.valueOf(i));
		System.out.println(fact);
	}

}
