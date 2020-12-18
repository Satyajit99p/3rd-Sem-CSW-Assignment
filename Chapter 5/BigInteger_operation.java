import java.math.BigInteger;

public class BigInteger_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger x=new BigInteger("484168461654845154416");
		BigInteger y=new BigInteger("1561468416218745341685");
		
		System.out.println("sum = "+x.add(y));
		System.out.println();
		System.out.println("difference = "+y.subtract(x));
		System.out.println();
		System.out.println("product = "+x.multiply(y));
		System.out.println();
		System.out.println("division = "+y.divide(x));
		System.out.println();
		System.out.println("modulus = "+x.mod(y));
		System.out.println();
		System.out.println("comparison = "+x.compareTo(y));
	}

}
