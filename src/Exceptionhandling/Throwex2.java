package Exceptionhandling;

public class Throwex2 {
	static void checkage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("u must be 18 yrars old");
		}
		System.out.println("u r old enough"); 
	}

	public static void main(String[] args)
	{
		checkage(23);

	}

}
