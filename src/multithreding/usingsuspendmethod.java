package multithreding;

class A5 extends Thread
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
class B5 extends Thread
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
class C5 extends Thread
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



public class usingsuspendmethod {

	public static void main(String[] args)
	{
      A5 a5=new A5();
      B5 b5=new B5();
      C5 c5=new C5();
      a5.start();
      b5.start();
      b5.suspend();
      c5.start();
	}

}
