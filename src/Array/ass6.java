package Array;

//remove element
import java.util.Scanner;
public class ass6 {

	public static void main(String[] args) 
	{
       int  i,n,p,j;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a size of array element");
       n=sc.nextInt();
       int arr[]=new int[5];
       
       System.out.println("enter array element");
       for(i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("array element is");
       for(i=0;i<n;i++)
       {
    	   System.out.println(arr[i]);
       }
       System.out.println("enter position to delete array element");
       p=sc.nextInt();
       
       for(i=0;i<n;i++)
       {
    	   if(arr[i]==p)
    	   {
    	       for(j=0;j<n;j++)
    	       {
    	    	  arr[j]=arr[j+1]; 
    	       }
  
    	   }
       }
     
       System.out.println("array element isafter deleting ");
       for(i=0;i<n-1;i++)
       {
    	   System.out.println(arr[i]);
       } 
       
	}
	

}
