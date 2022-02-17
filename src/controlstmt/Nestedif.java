package controlstmt;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args)
	{
	int a,b,c;
	int max=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a val of a");
     a=s.nextInt();
 	System.out.println("enter a val of b");
    b=s.nextInt();
	System.out.println("enter a val of c");
    c=s.nextInt();
    if(a>b)
    {
    	if(a>c) 
    		max=a;
    	else
    		max=c;
    }
    else
    {
    	if(b>c)
    		max=b;
    	else
    		max=c;
	}
     System.out.println("maximum val is"+max);
	}
}
