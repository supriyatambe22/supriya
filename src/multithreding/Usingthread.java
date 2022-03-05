package multithreding;
class A extends Thread
{
	public void run()
	{
		System.out.println("thread A is start");
		for(int i=0;i<=5;i++)
		{
			System.out.println("value of thread A is"+i);
		}
		System.out.println("exit thread A");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("thread B is start");
		for(int i=0;i<=5;i++)
		{
			System.out.println("value of thread B is"+i);
		}
		System.out.println("exit thread B");
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("thread C is start");
		for(int i=0;i<=5;i++)
		{
			System.out.println("value of thread C is"+i);
		}
		System.out.println("exit thread C");
	}
}


public class Usingthread {

	public static void main(String[] args) 
	{
       A a=new A();
       B b=new B();
       C c=new C();
       a.start();
       b.start();
       c.start();
	}

}
