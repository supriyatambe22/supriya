package multithreding;
class A1 implements Runnable{
	   public  void run()
	    {
	    	System.out.println("thread A is started");
	    	for(int i=0;i<6;i++)
	    	{
	    		System.out.println("the value of A is"+i);
	    	}
	    	System.out.println("thread A is exit");
	    }
}
class B1  implements Runnable
{
	public void run()
	{
		System.out.println("thread B is start");
		for(int j=0;j<=5;j++)
		{
			System.out.println("value of thread B is"+j);
		}
		System.out.println("exit thread B");
	}
}
class C1 implements Runnable
{
	public void run()
	{
		System.out.println("thread C is start");
		for(int k=0;k<=5;k++)
		{
			System.out.println("value of thread C is"+k);
		}
		System.out.println("exit thread C");
	}
}

public class Usingrunnable {

	public static void main(String[] args)
	{
   A1 a1=new A1();
   B1 b1=new B1();
   C1 c1=new C1();
   
   Thread t1=new Thread(a1);
   Thread t2=new Thread(b1);
   Thread t3=new Thread(c1);
   
   
   
   t1.start();
   t2.start();
   t3.start();

	}

}
