package controlstmt;
import java.util.Scanner;
public class Eifelseif {

	public static void main(String[] args) 
	{
		int day;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a day between 0 to 6");
		day=s.nextInt();
		if(day==0)
		{
			System.out.println("\nSunday");
		}
		else if(day==1)
		{
			System.out.println("\nmonday");

		}
		else if(day==2)
		{
			System.out.println("\ntuesday");
         }
		else if(day==3)
		{
			System.out.println("\nwednsday");
		}
		else if(day==4)
		{
			System.out.println("\nthursday");

		}
		else if(day==5)
		{
			System.out.println("\nfriday");
			}
		else if(day==6)
		{
			System.out.println("\nsaturday");

		}
		else
		{
			System.out.println("wrong input");

		}
		
}
		}

