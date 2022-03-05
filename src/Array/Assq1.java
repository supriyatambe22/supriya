
//1.wap to find average of aaray.

package Array;
import java.util.Scanner;
public class Assq1 {

	public static void main(String[] args) 
	{
				int sum =0;
				
		    System.out.println("no of element");
		    Scanner sc=new Scanner("System.in");
		    int n=sc.nextInt();
		    int arr[]=new int[5];
		    System.out.println("enter array  element is");
		    for(int i=0;i<n;i++)
		    {
		       arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.println("array  element is=="+arr[i]);
		         sum = sum+arr[i];
		    }
		        System.out.println("sum is"+sum);
		    
		    
	

	}

}
