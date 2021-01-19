 import java.util.Scanner;

public class Q7 {
	
	static int reversDigits(int num) 
    { 
        int rev_num = 0; 
        while(num > 0) 
        { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev_num; 
    } 
	static void isPalindrome(int n) 
    { 		
		int r,sum=0,temp;
		  
           temp=n;    
		  
		  while(n>0){   
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)   
			   System.out.print("is palindrome number ");    
			  else    
			   System.out.print("is not palindrome");  
    } 

	public static void main (String[] args)  
    { 
 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter the number ");    
		  int n=sc.nextInt();
		  int rev=reversDigits(n);
		  int sum=n+rev;
		  System.out.println("Input no. is "+n);
        System.out.println("Reverse of no. is " + rev);
        System.out.print("Sum of nos. is " + sum+" ");
        isPalindrome(sum);
    } 
}