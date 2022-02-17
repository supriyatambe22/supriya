package Exceptionhandling;

public class Exceptionhandling1 {
                        
	
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c;
		 System.out.println("this is msg");
		 try
		 {
			 c=a/b;
			 System.out.println("this is print"+c);

		 }
catch(Exception e)
		 {
	      System.out.println("exception handled");
		 }
		 System.out.println("after catch stmt");
	}

}
