import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		StringBuilder s1=sb.reverse();
		if(sb.equals(s1))
			System.out.println("palindrome");
			

	}

}
