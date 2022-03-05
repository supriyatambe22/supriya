package Array;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
 class Demo {

	public static void main(String[] args)
	{
	try
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter any numeric val");
        String num=br.readLine();
        int n=Integer.parseInt(num);
        float f=Float.parseFloat(num);
        double d=Double.parseDouble(num);
        
        System.out.println("Integer"+n);
        System.out.println("float"+n);
        System.out.println("double"+n);

	}
catch(IOException e)
	{
	e.printStackTrace();
	}
}
}