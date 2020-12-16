import java.util.*;
import java.util.regex.Pattern;
public class Sim_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="6854231457";	//sc.nextLine();
		String p="^[697]\\d{9}";
		System.out.println(Pattern.matches(p, s));
	}

}
