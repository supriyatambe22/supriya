package multithreding;
class Aa extends Thread
{ int total=0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				total=total+100;
			}
			this.notify();
		}
	}
	
}
public class Usingwait{ 

	public static void main(String[] args)throws InterruptedException {
Aa obj=new Aa();
obj.start();
synchronized(obj)
{
	obj.wait();
	System.out.println("total is"+obj.total);
}
	}

}
