import java.util.*;
public class DOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String a[]=s1.split("/");
		String b[]=s2.split("/");
		Integer p=Integer.parseInt(a[2]);
		Integer q=Integer.parseInt(b[2]);
		int age=q-p;
		System.out.println(age);
	}

}
