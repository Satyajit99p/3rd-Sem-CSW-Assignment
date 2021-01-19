import java.text.DecimalFormat;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        
        DecimalFormat myFormatter = new DecimalFormat("###,###.##");
	    String celsiusfinal = myFormatter.format(celsius);
       
	    
	    System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsiusfinal + " in Celsius");
    }
}