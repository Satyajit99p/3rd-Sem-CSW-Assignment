import java.text.NumberFormat;
import java.util.Scanner;
public class Max_min_Fract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		double x=sc.nextDouble();
		System.out.println("enter max");
		int p=sc.nextInt();
		System.out.println("enter min");
		int q=sc.nextInt();
		NumberFormat form=NumberFormat.getInstance();
		form.setMaximumFractionDigits(p);
		form.setMinimumFractionDigits(q);
		System.out.println(form.format(x));
	}

}
