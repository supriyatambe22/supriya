package controlstmt;
import java.util.Scanner;
public class Swtstmt {

	public static void main(String[] args)
	{
		System.out.println("\nenter a key value");
		Scanner s=new Scanner(System.in);
		int key=s. nextInt();
		     switch(key)
		     {
		       case 1: 
		        System.out.println("colour is red");
		           break;
		        case 2: 
		        System.out.println("colour is black");
		          break;
		       case 3: 
		       System.out.println("\ncolour is pink");
		           break;
		       case 4: 
		        System.out.println("\ncolour is yellow");
		       break;
			   
		          default: 
		          System.out.println("wrong choice");
		                   
                   break;
		}
		}
		
	}


