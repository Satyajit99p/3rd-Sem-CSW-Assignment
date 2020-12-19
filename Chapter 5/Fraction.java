import java.text.NumberFormat;
import java.util.Scanner;
public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		NumberFormat form=NumberFormat.getInstance();
		form.setMaximumFractionDigits(2);
		System.out.println(form.format(x));
	}

}
