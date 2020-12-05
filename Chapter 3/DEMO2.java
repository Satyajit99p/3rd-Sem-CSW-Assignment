import java.util.Scanner;
public class DEMO2 {
public static void main(String[]args)

{
	Scanner sc=new Scanner(System.in);
	String x=sc.nextLine();
	String y=sc.nextLine();
	
	try {
	System.out.println(x.substring(0,5).concat(y.substring(0,7)));
	}
	catch(Exception e)
	{
		System.out.println("ERROR= "+e);
		System.out.println("enter string with more than 7 characters");
	}
}
}
