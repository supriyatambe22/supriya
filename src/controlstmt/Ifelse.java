package controlstmt;
import java.util.Scanner;
  public class Ifelse {
	   public static void main(String[] args)
		    {
			  Scanner s=new Scanner(System.in);

			System.out.println("enter a marks");
			 
			  int mark=s.nextInt();
			  if(mark>40)
			  {
				  System.out.println("u r pass");
			  }
			  else
			  {
				  System.out.println("failed");
			  }

	        
		}

	}
