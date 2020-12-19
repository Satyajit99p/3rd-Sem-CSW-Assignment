import java.lang.*;
import java.util.*;
public class Matrix_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dimensions of 1st array");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int[][] x=new int[p][q];
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++) {
				System.out.println("enter elements");
				int a=sc.nextInt();
				x[i][j]=a;
		}
		}
		System.out.println("enetr columns dimensionof 2nd array");
		int r=sc.nextInt();
		int[][] y=new int[q][r];
		for(int i=0;i<q;i++)
		{
			for(int j=0;j<r;j++) {
				System.out.println("enter element");
				y[i][j]=sc.nextInt();
		}
		}
		System.out.println();
		System.out.println("1st array");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				
				System.out.print(x[i][j]+",");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("2nd array");
		for(int i=0;i<q;i++)
		{
			for(int j=0;j<r;j++)
			{
				
				System.out.print(y[i][j]+",");
			}
			System.out.println();
		}
		
		System.out.println();
		int[][] pro=new int[p][r];
		System.out.println("matrix product");
		for(int i=0;i<p;i++)
		{    
			for(int j=0;j<r;j++)
			{    
			pro[i][j]=0;      
			for(int k=0;k<p;k++)      
			{      
			pro[i][j]+=x[i][k]*y[k][j];      
			}
			System.out.print(pro[i][j]+" ");
			}
			System.out.println();
		}
	}
}

