package Array;

import java.util.Scanner;

// Accept array element from user
public class Ass5 {

	public static void main(String[] args)
	{

		     Scanner sc=new Scanner(System.in);
		   System.out.println("how many elemnt to enter");
		     int n=sc.nextInt();
		     int[] Score=new int[5];
		     System.out.println("enter a array element");
		     for(int i=0;i<n;i++)
		     {
		    	Score[i]=sc.nextInt(); 
		    	
		     }
		     System.out.println("array elemnt is");
		     for(int i=0;i<n;i++)
		     {
		        System.out.println(+Score[i]);

		     }

			}

}
