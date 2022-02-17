package Inheritance;
import java.util.Scanner;
interface Stud4 
{
	static final int std=1;
	abstract public void display();
	abstract public void get();
}
interface Stud5 
{
	static final int std=1;
	abstract public void display();
}
class Stud6
{
	String name;
	public void get()
	{
		System.out.println("\nEnter name of stud");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
	}
	public void display1()
	{
		System.out.println("\n name of stud is"+name);
	}
}
class Stud7 extends Stud6 
{
	String college;
	public void get1()
	{
		System.out.println("\nEnter college name of stud");
		Scanner s=new Scanner(System.in);
		college=s.nextLine();
	}
	public void display()
	{
		System.out.println("\n  college name of stud is"+college);
	}
	
}
public class Multiple  extends Stud7 implements Stud4,Stud5
{

	public static void main(String[] args)
	{

     Multiple m=new Multiple();
      m.get();
      m.get1();
      m.display();
      System.out.println("\n interface1"+Stud4.std);
      System.out.println("\n interface2"+Stud5.std);

	}

}
