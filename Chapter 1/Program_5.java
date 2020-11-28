import java.util.Scanner;

class Bank extends Program_5
{
	int dep,amt;
	

		public void withdraw(int bal)
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter Amount");
			int amt=sc.nextInt();
			
			if(amt>bal)
				System.out.println("insufficient fund");
			else {
				System.out.println(amt);
				bal=bal-amt;
				System.out.println("net balance is"+bal);
				
			}
				
		}
		
		public void deposit(int bal)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter amount");
			int dep=sc.nextInt();
			bal=dep+bal;
			System.out.println("net balance is "+bal);
		}
		
		public void balance(int bal)
		{
			System.out.println(bal);
		}
	

	}


public class Program_5 {
	
	
	static int bal=1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Bank ob=new Bank();
		System.out.println("enter 1 for balance,2 for deposit,3for withdrawal and 0 to exit");
		while(true)
		{
		int ch=sc.nextInt();
		if(ch==0)
		{
			System.out.println("thank you");
			break;
		}
		
		
		switch(ch)
		{
		case 1:ob.balance(bal);break;
		case 2:ob.deposit(bal);break;
		case 3:ob.withdraw(bal);break;
		default:System.out.println("invalid input");
		}
	}
	}
}
