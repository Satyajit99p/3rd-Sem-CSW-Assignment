import java.math.BigDecimal;

public class BigDecimal_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal x=new BigDecimal("4.84168461654845154416");
		BigDecimal y=new BigDecimal("1.561468416218745341685");
		
		System.out.println("sum = "+x.add(y));
		System.out.println();
		System.out.println("difference = "+y.subtract(x));
		System.out.println();
		System.out.println("product = "+x.multiply(y));
		System.out.println();
		System.out.println("comparison = "+x.compareTo(y));
		System.out.println();
		System.out.println("division = "+x.divide(y));
	}

}
