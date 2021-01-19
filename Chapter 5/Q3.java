
public class Q3 {
	public static void main(String[] args) {
		int numArgs = args.length;

		
	        if (numArgs < 2) {
	            System.out.println("This program requires two command-line arguments.");
	        } else {
		    int sum = 0;

		    for (int i = 0; i < numArgs; i++) {
	                sum += Integer.valueOf(args[i]).intValue();
		    }

		
	            System.out.println(sum);
	        }
	    }
}