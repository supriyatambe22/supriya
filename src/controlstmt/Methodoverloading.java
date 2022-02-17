package controlstmt;


public class Methodoverloading {
   public void add(int a,int b)
   {
	   int sum=a+b;
	   System.out.println("\naddition is"+sum);
   }
   public void add(int b,double c)
   {
	   double temp=b+c;
	   System.out.println("\n addition is"+temp);
   }
	public static void main(String[] args) 
	{
	 Methodoverloading o=new Methodoverloading();
	 o.add(9,3);
	 o.add(9,10.2);

	}

}
