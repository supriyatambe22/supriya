package Exceptionhandling;
import java.io.*;
class Tex{
	void get(int num)throws IOException,ClassNotFoundException
	{
		if(num==1)
		{
			throw new IOException("IOException occured");
		}
		else 
		{
			throw new ClassNotFoundException("Class not foundfException occured");
        }
	}
	
	
}

public class Throwsex {

	public static void main(String[] args)
	{
 try
 {
	 Tex obj=new Tex();
	 obj.get(1);
 }
 catch( Exception e)
 {
	System.out.println(e); 
 }
	}
}