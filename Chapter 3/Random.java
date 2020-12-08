import java.util.Scanner;

//to generate random string of a given size.
public class Random {

	  
				  
		public static void main(String[] args) 
		{ 
			int MAX = 26;
			
			Scanner sc=new Scanner(System.in);
		    int n = sc.nextInt(); 
		    char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 
                    'h', 'i', 'j', 'k', 'l', 'm', 'n',  
                    'o', 'p', 'q', 'r', 's', 't', 'u', 
                    'v', 'w', 'x', 'y', 'z' }; 

		    String res = ""; 
		    for (int i = 0; i < n; i++)  
		    	res = res + alphabet[(int) (Math.random() * 10 % MAX)];
		    System.out.println(res); 
	}

}