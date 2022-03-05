package Array;
//bubblesort
import java.util.Scanner;

public class Ass8 {

	public static void main(String[] args)
	{ 
		int  i,n,p,j;
		
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter a size of array element");
	       n=sc.nextInt();
	       int arr[]=new int[7];
	       
	       System.out.println("enter array element");
	       for(i=0;i<n;i++)
	       {
	    	   arr[i]=sc.nextInt();
	       }
	       for(i=0;i<n-1;i++)
	       {
		       for(j=0;j<n-i-1;j++)
		       {
		    	 if(arr[j]>arr[j+1]) 
		    	 {
		    		int temp=arr[j];
		    		arr[j]=arr[j+1];
		    		arr[j+1]=temp;
		    		
		    	 }
		       }

	       }
	    
	
	       System.out.println("after sorting");
	       for(i=0;i<n;i++)
	       {
	    	   System.out.println(arr[i]);
	       }
	}
}
