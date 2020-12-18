import java.text.NumberFormat;
import java.util.*;
public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		NumberFormat form=NumberFormat.getInstance();
		form.setMinimumIntegerDigits(3);
		form.setMaximumFractionDigits(4);
		form.setMinimumFractionDigits(2);
		System.out.println(form.format(x));

	}

}
