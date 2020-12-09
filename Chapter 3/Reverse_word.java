import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<String> stack=new Stack<>();
		StringTokenizer sd=new StringTokenizer(s);
		while(sd.hasMoreTokens())
			stack.push(sd.nextToken());
		while(!stack.empty())
		{
			System.out.print(stack.pop()+" ");
			
		}

	}

}
