package Inheritance;
import java.util.Scanner;
class A{
	 int rno;
	 String name; 
	 Scanner sc=new Scanner(System.in);
	 public void get()
	 { 
		 System.out.println("\nEnter name of the student");
		 name=sc.nextLine();
		 System.out.println("\nEnter rollnumber of the student");
		 rno=sc.nextInt();
	 } 
	 }
    class Stud extends A{
		 String  address;
		 String  department;
		 void get1()
		  {
			  System.out.println("\nEnter address of the student==");
				 address=sc.nextLine();
			 System.out.println("\nEnter department of the student==");
				 department=sc.nextLine();
				 }
		 void show()
		 {
			System.out.println("\n -----Student info------");
			System.out.println("\nname of student is=="+name);
			System.out.println("\nroll number of student is=="+rno);
			System.out.println("\naddress of student is=="+address);
			System.out.println("\ndept  of student is=="+department);
           }
	 }
public class Singleinh {

	public static void main(String[] args)
	{ 
		Stud b=new Stud();
		b.get();
		b.get1();
		b.show();
	}

}
