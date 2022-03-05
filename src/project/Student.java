package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

 class Student {

	private String Name;
	private String Address;
	private  String Mob_no;
	private String Emailid;
    private String Grade;
    private String Fees;
    private String ID;
	public Student(String Name, String Address, String Mob_no, String Emailid,String Grade,String Fees,String ID) 
	{

		this.Name = Name;
		this.Mob_no = Mob_no;
		this.Address = Address;
		this.Emailid = Emailid;
		this.Grade=Grade;
		this.Fees=Fees;
		this.ID=ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getMob_no() {
		return Mob_no;
	}

	public void setMob_no(String Mob_no) {
		this.Mob_no = Mob_no;
	}

	public String getEmailid(String Emailid) {
		return Emailid;
	}

	public void setEmailid(String Emailid) {
		this.Emailid = Emailid;
	}
	public String getGrade() {
		return Grade;
	}

	public void setGrade(String Grade) {
		this.Grade = Grade;
	}
	public String getFees() {
		return Fees;
	}

	public void setFees(String Fees) {
		this.Fees = Fees;
	}
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}


	public String toString() {
return this.Name + "\t\t" + this.Address + "\t\t\t" + this.Mob_no + "\t\t\t" + this.Emailid+ "\t\t\t" + this.Grade+ "\t\t" + this.Fees + "\t\t"+this.ID;
	}
}
//public class Student
//{
//	public static void main(String[] args) 
//	{  
//	List<Student1> al1=new ArrayList<Student1>();
//""
//		String Name;
//		String Address;
//		String Mob_no;
//		String Emailid;
//		String Grade;
//		String Fees;
//		int ID;
//	     Scanner scn1=new Scanner(System.in);
//	     Scanner sc=new Scanner(System.in);
//			while(true)
//			{
//		System.out.println("=========================================================");
//
//		System.out.print("\nYour  Choice  is=:\n1.ADD\n2.DISPLAY\n\n3.DELETE\n\n4.SEARCH\n\n5.UPDATE");
//		System.out.println("\n=========================================================");
//        System.out.println("Enter the choice: ");
//		int num=scn1.nextInt();
//		System.out.println("\n=========================================================");
//
//		switch(num)
//		{
//case 1:
//		
//		System.out.print("\nName: ");
//		Name=scn1.next();
//		System.out.print("\nAddress: ");
//		Address=scn1.next();
//		System.out.print("\nMob_no: ");
//		Mob_no=scn1.next();
//		System.out.print("\nEmailid: ");
//		Emailid=scn1.next();
//		System.out.print("\nGrade: ");
//		Grade=sc.next();
//		System.out.print("\nFees: ");
//		Fees=scn1.next();
//		System.out.println("\nID");
//		ID=scn1.nextInt();
//
//	
//      al1.add(new Student1(Name,Address,Mob_no,Emailid,Grade,Fees,ID));
//		break;
//		
//case 2:
//		
//			System.out.println("================================================================================================");
//			System.out.println("Name"+"\t\t"+"Address"+"\t\t\t"+"Mon_no"+"\t\t\t"+"Emailid"+"\t\t\t"+"Grade"+"\t\t"+"Fees");
//			System.out.println("\n=============================================================================================");
//
//		    Iterator<Student1> it=al1.iterator();
//		    while(it.hasNext())
//		    {  
//		    	Student1 s=it.next();
//				System.out.println(s);
//
//		    }
//			System.out.println("\n================================================================================================");
//
//             break;
//case 3:
//       boolean found=false;
//	   System.out.println("Enter a ID to delete ");
//	    ID=scn1.nextInt();
//		System.out.println("=======================================================================================================");
//		it=al1.iterator();
//	    while(it.hasNext())
//	    {  
//	    	Student1 s=it.next();
//        if(s.getID()==ID)
//	    	{
//			it.remove();
//           found=true;
//	    	}
//
//	    }
//
//       if(!found)
//       {
//			System.out.println("Record not found");
//
//      	 
//       }
//       else
//       {
//    	   System.out.println("Record is deleted");
//       }
//		System.out.println("============================================================================================================");
//
//         break;
//	   
//case 4:
//		 found=false;
//		  System.out.println("Enter a ID to search ");
//		    ID=scn1.nextInt();
//			System.out.println("===========================================================================================================");
//			it=al1.iterator();
//		    while(it.hasNext())
//		    {  
//		    	Student1 s=it.next();
//              if(s.getID()==ID)
//		    	{
//      			System.out.println(s);
//                 found=true;
//		    	}
//
//		    }
//
//             if(!found)
//             {
//     			System.out.println("Record not found");
//
//            	 
//             }
// 			System.out.println("===============================================================================================================");
//		    break;
//case 5:
//	 found=false;
//	  System.out.println("Enter a ID to update ");
//	    ID=scn1.nextInt();
//		System.out.println("====================================================================================================================");
//		ListIterator<Student1>li=al1.listIterator();
//	    while(li.hasNext())
//	    {  
//	    	Student1 s=li.next();
//         if(s.getID()==ID)
//	    	{
//        	 System.out.print("\nName: ");
//     		Name=scn1.next();
//     		System.out.print("\nAddress: ");
//     		Address=scn1.next();
//     		System.out.print("\nMob_no: ");
//     		Mob_no=scn1.next();
//     		System.out.print("\nEmailid: ");
//     		Emailid=scn1.next();
//     		System.out.print("\nGrade: ");
//     		Grade=sc.next();
//     		System.out.print("\nFees: ");
//     		Fees=scn1.next();
//     		System.out.println("\nID");
//     		ID=scn1.nextInt();
//           li.set(new Student1(Name,Address,Mob_no,Emailid,Grade,Fees,ID));
//           found=true;
//	    	}
//
//	    }
//
//        if(!found)
//        {
//			System.out.println("Record not found");
//			}
//        else
//        {
//    		System.out.println("Record update successfully");
//	
//        }
//		System.out.println("========================================================================================================");
//	    break;	    
//   default:
//         System.out.println("wrong choice");
//		}
//		System.out.println("do u want to continue Y/N");
//		scn1.next();
//	}
//	
//	
//	
//	}
//	}
//
//
//
