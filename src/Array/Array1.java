package Array;
import java.util.Scanner;
public class Array1 {

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
     System.out.println("array elemnt are");
     for(int i=0;i<n;i++)
     {
        System.out.println(+Score[i]);

     }

	}

}
