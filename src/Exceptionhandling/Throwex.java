package Exceptionhandling;
class Myexception extends Exception
{ 
	public Myexception(String msg)
	{
		super(msg);
		
	}
}

public class Throwex
{
	static void studage(int age)throws Myexception
	{
		if(age<0)
		{
			Myexception obj=new Myexception("age cant be less then zero");
			throw obj;
		}
		else
		{
			System.out.println("ip is ");
		}
	}

	public static void main(String[] args) 
	{
        try
        {
        	studage(6);
        	
        }
        catch(Myexception e)
        {
        	e.printStackTrace();
        }
	}
	

}
