package multithreding;

public class Threadusingjoin  extends Thread 
{ 
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
		}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args)
	{
		Threadusingjoin t1=new Threadusingjoin();
		Threadusingjoin t2=new Threadusingjoin();
		Threadusingjoin t3=new Threadusingjoin();
		t1.start();
		try
		{
			t1.join();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
