
public class CMD {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		String a=args[0];
		int b=Integer.parseInt(args[1]);
		double c=Double.parseDouble(args[2]);
		short d=Short.parseShort(args[3]);
		char e=a.charAt(3);
		System.out.println("String="+a);
		System.out.println("Integer="+b);
		System.out.println("Double="+c);
		System.out.println("Short="+d);
		System.out.println("Character="+e);
		
		System.out.println();
		
		int x=Integer.parseInt(args[4]);
		int y=Integer.parseInt(args[5]);
		int z=x+y;
		System.out.println("SUM="+z);
	}

}
