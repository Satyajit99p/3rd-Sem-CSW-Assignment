
public class Example
{
	public static void main(String []args)
	{
	String s="34.56";
	String []ar=s.split(".");
	System.out.println(ar[0]);
	for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
	//int x=Integer.parseInt(ar[0]);
	//int y=Integer.parseInt(ar[1]);
	//System.out.println(x+y);
	}
}