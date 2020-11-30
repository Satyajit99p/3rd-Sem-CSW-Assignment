import java.util.*;
public class Capital_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String temp="";
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) 
		{
			String s1=st.nextToken();
			temp=temp+s1.substring(0,1).toUpperCase()+s1.substring(1)+" ";
		}
		System.out.println(temp);

	}

}
