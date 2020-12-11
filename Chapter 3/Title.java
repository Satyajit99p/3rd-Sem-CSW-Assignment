import java.util.*;
public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		String t="";
		StringTokenizer st=new StringTokenizer(s,". ");
		t=st.nextToken();
		sb=sb.delete(0, t.length()+1);
		System.out.println(sb);

	}

}
