import java.util.Scanner;
public class Order{

  public static void main(String[] args) {
    int n;
    String temp;
    Scanner sc=new Scanner(System.in);
    
    n=sc.nextInt();
    sc.nextLine();
    String names[] = new String[n];
    
      for(int i=0; i<n; i++)
      {
              
              names[i] = sc.nextLine();
       }
      for(int i=0; i<n; i++)
        {
            for(int j=1; j<n; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
      
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
  }

}