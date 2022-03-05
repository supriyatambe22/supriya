package Array;

import java.util.Scanner;

//search element
public class Ass7 {

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
	       System.out.println("enter array element to search");
	       p=sc.nextInt();
	       for(i=0;i<n;i++)
	       {
	    	   if(p==arr[i])
	    	   {
	    		   System.out.println("number  is found" +i  );
	    		   break;
	    	   }
	    	   if(i==n)
	    	  // else
	    	   {
	    		   System.out.println("not found"+p);
	    	   }
	       }
	       
	}

}
