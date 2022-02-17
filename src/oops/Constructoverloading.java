package oops;
class Area{
	     public Area(int a)
	     {
	    	 int sqarea=a*a;
	    	 System.out.println("\nvalue of a is"+a);
             System.out.println("\nArea of square is=="+sqarea);
	     }
	     public Area(int l,int b)
	     {
	    	 int rectarea=l*b;
	    	 System.out.println("\n\nvalue of length is"+l);
	    	 System.out.println("\nvalue of breadth is"+b);
             System.out.println("\nArea of rectangle is=="+rectarea);
	     }
	     public Area(double pi,int r)
	     {
	    	double circlearea=pi*r*r;
	    	 System.out.println("\n\nvalue of  pi is"+pi);
	    	 System.out.println("\nradius is "+r);
	    	 System.out.println("\nArea of circle is=="+circlearea);
	     }
}
public class Constructoverloading {

	public static void main(String[] args)
	{
	    Area obj=new Area(2);
	    Area obj2=new Area(2,4);	  
	    Area obj3=new Area(3.14,2);

	    }

}
