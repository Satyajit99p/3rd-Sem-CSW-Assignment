import java.util.Scanner;
public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		String temp="";
		for(int i=0;i<sb.length();i++)
		{
			char x=sb.charAt(i);
			if(x=='0')
			{
				sb.deleteCharAt(i);
				temp=temp+" zero ";
			}
			else if(x=='1')
			{
				sb.deleteCharAt(i);
				temp=temp+" one ";
			}
			else if(x=='2')
			{
				sb.deleteCharAt(i);
				temp=temp+" two ";
			}
			else if(x=='3')
			{
				sb.deleteCharAt(i);
				temp=temp+" three ";
			}
			else if(x=='4')
			{
				sb.deleteCharAt(i);
				temp=temp+" four ";
			}
			else if(x=='5')
			{
				sb.deleteCharAt(i);
				temp=temp+" five ";
			}
			else if(x=='6')
			{
				sb.deleteCharAt(i);
				temp=temp+" six ";
			}
			else if(x=='7')
			{
				sb.deleteCharAt(i);
				temp=temp+" seven ";
			}
			else if(x=='8')
			{
				sb.deleteCharAt(i);
				temp=temp+" eight ";
			}
			else if(x=='9')
			{
				sb.deleteCharAt(i);
				temp=temp+" nine ";
			}
			else
				temp=temp+x;

		}
		System.out.println(temp);

	}

}
