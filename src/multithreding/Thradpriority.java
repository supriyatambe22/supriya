package multithreding;

class A4 extends Thread {
	public void run()
	{
		System.out.println("Thread A Started");
		for (int i = 1; i <= 4; i++) {
		System.out.println("From thread A" + i);
		}
		System.out.println("exit A ");
	}
}

class B4 extends Thread {
	public void run()
	{
		System.out.println("Thread B Started");
		for (int j = 0; j <= 4; j++) {
		System.out.println("From thread B" + j);
		}
		System.out.println("exit B");
	}
}

class C4 extends Thread {
	public void run()
	{
	System.out.println("Thread C Started");
	for (int k = 0; k <= 4; k++) {
	System.out.println("From thread C : K =" + k);
	}
	System.out.println("exit  C");
	}
}

public class Thradpriority {
	public static void main(String args[])
       { 
	          A4 threadA4 = new A4();
	          B4 threadB4 = new B4();
	           C4 threadC4 = new C4(); 
	  
	          threadC4.setPriority(Thread.MAX_PRIORITY); 
	  
	          threadB4.setPriority(threadA4.getPriority()+1);
	  
	          threadA4.setPriority(Thread.MIN_PRIORITY);
	  
	           System.out.println( "Start Thread A");
	  
	            threadA4.start();
	         
	            System.out.println( "Start Thread B");

               System.out.println( "Start Thread C"); 
         
               threadC4.start(); 
               
           System.out.println("Exit from main thread ");
}
}
