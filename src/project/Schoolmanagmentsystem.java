package project;

import java.util.*;

class Schoolmanagmentsystem1 {

	
	private String Name;
	private String Address;
	private  String Mob_no;
	private String Emailid;

	public Schoolmanagmentsystem1(String Name, String Address, String Mob_no, String Emailid) {

		this.Name = Name;
		this.Mob_no = Mob_no;
		this.Address = Address;
		this.Emailid = Emailid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		Address = Address;
	}

	public String getMob_no() {
		return Mob_no;
	}

	public void setMob_no(String Mob_no) {
		Mob_no = Mob_no;
	}

	public String getEmailid(String Emailid) {
		return Emailid;
	}

	public void setEmailid(String Emailid) {
		Emailid = Emailid;
	}

	public String toString() {
		return this.Name + "\t\t" + this.Address + "\t\t\t" + this.Mob_no + "\t\t\t" + this.Emailid;
	}
}
public class Schoolmanagmentsystem
{
	public static void main(String[] args) 
	{  
	ArrayList<Schoolmanagmentsystem1>al=new  ArrayList<Schoolmanagmentsystem1>();
	        String Name;
	     	String Address;
		    String Mob_no;
	        String Emailid;
	
			while(true)
			{
			     Scanner scn1=new Scanner(System.in);

		System.out.println("=================ADMISSION FORM========================================");

		System.out.print("\nY1our  Choice  is=:\n1.ADD\n2.DISPLAY\n\n");
		System.out.println("=========================================================");
        System.out.println("Enter the choice: ");
		int num=scn1.nextInt();
		System.out.println("=========================================================");

		switch(num)
		{
		case 1:
		
		System.out.print("\nName: ");
		Name=scn1.next();
		System.out.print("\nAddress: ");
		Address=scn1.next();
		System.out.print("\nMob_no: ");
		Mob_no=scn1.next();
		System.out.print("\nEmailid: ");
		Emailid=scn1.next();
      al.add(new Schoolmanagmentsystem1(Name,Address,Mob_no,Emailid));
		break;
		

		case 2:
		
			System.out.println("=========================================================");
			System.out.println("Name"+"\t\t"+"Address"+"\t\t\t"+"Mon_no"+"\t\t\t"+"Emailid");
			System.out.println("=========================================================");

		    Iterator<Schoolmanagmentsystem1> it=al.iterator();
		    while(it.hasNext())
		    {  
		    	Schoolmanagmentsystem1 s=it.next();
				System.out.println(s);

		    }
		   
             break;
             default:
            	 System.out.println("wrong choice");
		}
		System.out.println("do u want to continue Y/N");
		scn1.next();
			}
			}
}



	
	
	
	

             
             