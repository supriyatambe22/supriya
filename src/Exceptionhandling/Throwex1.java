package Exceptionhandling;
class Myexception1 extends Exception
{
	public Myexception1(String msg)
	{
		super(msg);
	}
}
public class Throwex1 {
	static void mark(int mark)throws Myexception1
	{
		if(mark <30)
		{
			Myexception1 obj=new Myexception1("failed");
			throw obj;
		}
		System.out.println("pass");
	}

	public static void main(String[] args) 
	{
		try
		{
			mark(67);
		}
		catch(Myexception1 e)
		{
			e.printStackTrace();
		}
	}

}
