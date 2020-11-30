import java.util.Scanner;
public class CheckSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
			sum=sum+s.charAt(i);
		
		
		System.out.println(sum);
	}

}
