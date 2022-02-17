package Inheritance;
import java.util.Scanner;
class A1{
	 int rno;
	 String name; 
	 Scanner sc=new Scanner(System.in);
	 public void get()
	 { 
		 System.out.println("\nEnter name of the student==");
		 name=sc.nextLine();
		 System.out.println("\nEnter rollnumber of the student==");
		 rno=sc.nextInt();
	 } 
	 }
class B1 extends A1{
		 String  address;
		 String  department;
		 void get1()
		  {
			 Scanner sc=new Scanner(System.in);
              System.out.println("\nEnter address of the student==");
				 address=sc.nextLine();
				 }
	 }
 class C extends B1 {
	          String college;
             String city;
	 void get2()
	 {  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter college of the student==");
		 college=sc.nextLine();
		 System.out.println("enter city of the student==");
		 city=sc.nextLine();
		  }
	 void show()
	 {
		System.out.println("\n -----Student info------");
		System.out.println("\nname of student is=="+name);
		System.out.println("\nroll number of student is=="+rno);
		System.out.println("\naddress of student is=="+address);
		System.out.println("\ncollege of student is=="+college);
		System.out.println("\ncity of student is=="+city);

       }
 }
	 
public class Multilevel {

	public static void main(String[] args) 
	{
		C b=new C();
		b.get();
		b.get1();
		b.get2();
		b.show();
	
	}

}
