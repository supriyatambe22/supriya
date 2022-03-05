package multithreding;
class A2 extends Thread
{
	public void run()
	{
		System.out.println("thread A is start");
		for(int i=0;i<=5;i++)
		{  
			
			
			
			try
			{
				Thread.sleep(1000);
			} 
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("value of thread A is"+i);
		}
		System.out.println("exit thread A");
	}
}

class B2 extends Thread
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
class C2 extends Thread
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


public class Usingsleepmethod {

	public static void main(String[] args)
	{
      A2 a=new A2();
      B2 b=new B2 ();
      C2 c=new C2();
      a.start();
      b.start();
      c.start();
      }

}
