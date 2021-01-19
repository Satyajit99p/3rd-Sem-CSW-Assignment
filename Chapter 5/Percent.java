import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
public class Percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		NumberFormat form=new DecimalFormat("%");
		
		System.out.println(form.format(x));

	}

}
