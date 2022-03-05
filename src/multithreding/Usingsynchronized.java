package multithreding;
class Bookmyshow
{
	static int total_ticket=10;
	synchronized public void bookTickets(int ticket)
	{
		if(total_ticket>=ticket)
		{
			total_ticket=total_ticket-ticket;
			System.out.println(ticket+"is boooked&remaning are"+total_ticket);
		}
		else
		{
			System.out.println("Ticket is not book"+total_ticket+"are available");
		}
	}
}
public class Usingsynchronized  extends Thread{
	     static Bookmyshow book;
	     int t;
	
public void run()
{
	book.bookTickets(t);
}
public static void main(String args[])
{
	book=new Bookmyshow();
	Usingsynchronized a1=new Usingsynchronized();
	a1.t=3;
	a1.start();
	Usingsynchronized a2=new Usingsynchronized();
	a2.t=5;
	a2.start();
}
}
