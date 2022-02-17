package Array;
import java.util.Scanner;
public class Array2 
{

	public static void main(String[] args) 
	{ int sum =0;
	Scanner sc=new Scanner(System.in);
    System.out.println("no of element");
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
        System.out.println("sum is"+sum);
    }
    
	}

}
