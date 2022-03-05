package oops;
 class Parameterised1 {
          int x,y,temp;
		public Parameterised1(int a,int b)
		{
			x=a;
			y=b;
		}
		void show()
		{
		 System.out.println("value of a is"+x); 
		 System.out.println("value of a is"+y); 

		}
		
		public Parameterised1( int a,int b,int c)
		{
		 temp=a+b+c;
		}
		void display()
		{
		System.out.println("\n addition is"+temp);
		}
		}
	 public class Parameterised 
		{
		public static void main (String args[])
		{
		Parameterised1 obj=new  Parameterised1(2,3);
		obj.show();
		Parameterised1 obj1=new Parameterised1(2,4,5);
		obj1.display();
		}
		

	}


