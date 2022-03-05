import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Student
{
	public static void main(String[] args) 
	{  
	List<Student> al1=new ArrayList<Student>();

		String Name;
		String Address;
		String Mob_no;
		String Emailid;
		String Grade;
		String Fees;
		int ID;
	     Scanner scn1=new Scanner(System.in);
	     Scanner sc=new Scanner(System.in);
			while(true)
			{
		System.out.println("=========================================================");

		System.out.print("\nYour  Choice  is=:\n1.ADD\n2.DISPLAY\n\n3.DELETE\n\n4.SEARCH\n\n5.UPDATE");
		System.out.println("\n=========================================================");
        System.out.println("Enter the choice: ");
		int num=scn1.nextInt();
		System.out.println("\n=========================================================");

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
		System.out.print("\nGrade: ");
		Grade=sc.next();
		System.out.print("\nFees: ");
		Fees=scn1.next();
		System.out.println("\nID");
		ID=scn1.next();

	
      al1.add(new Student(Name,Address,Mob_no,Emailid,Grade,Fees,ID));
		break;
		
case 2:
		
			System.out.println("================================================================================================");
			System.out.println("Name"+"\t\t"+"Address"+"\t\t\t"+"Mon_no"+"\t\t\t"+"Emailid"+"\t\t\t"+"Grade"+"\t\t"+"Fees");
			System.out.println("\n=============================================================================================");

		    Iterator<Student> it=al1.iterator();
		    while(it.hasNext())
		    {  
		    	Student1 s=it.next();
				System.out.println(s);

		    }
			System.out.println("\n================================================================================================");

             break;
case 3:
       boolean found=false;
	   System.out.println("Enter a ID to delete ");
	    ID=scn1.nextInt();
		System.out.println("=======================================================================================================");
		it=al1.iterator();
	    while(it.hasNext())
	    {  
	    	Student1 s=it.next();
        if(s.getID()==ID)
	    	{
			it.remove();
           found=true;
	    	}

	    }

       if(!found)
       {
			System.out.println("Record not found");

      	 
       }
       else
       {
    	   System.out.println("Record is deleted");
       }
		System.out.println("============================================================================================================");

         break;
	   
case 4:
		 found=false;
		  System.out.println("Enter a ID to search ");
		    ID=scn1.nextInt();
			System.out.println("===========================================================================================================");
			it=al1.iterator();
		    while(it.hasNext())
		    {  
		    	Student1 s=it.next();
              if(s.getID()==ID)
		    	{
      			System.out.println(s);
                 found=true;
		    	}

		    }

             if(!found)
             {
     			System.out.println("Record not found");

            	 
             }
 			System.out.println("===============================================================================================================");
		    break;
case 5:
	 found=false;
	  System.out.println("Enter a ID to update ");
	    ID=scn1.nextInt();
		System.out.println("====================================================================================================================");
		ListIterator<Student1>li=al1.listIterator();
	    while(li.hasNext())
	    {  
	    	Student1 s=li.next();
         if(s.getID()==ID)
	    	{
        	 System.out.print("\nName: ");
     		Name=scn1.next();
     		System.out.print("\nAddress: ");
     		Address=scn1.next();
     		System.out.print("\nMob_no: ");
     		Mob_no=scn1.next();
     		System.out.print("\nEmailid: ");
     		Emailid=scn1.next();
     		System.out.print("\nGrade: ");
     		Grade=sc.next();
     		System.out.print("\nFees: ");
     		Fees=scn1.next();
     		System.out.println("\nID");
     		ID=scn1.nextInt();
           li.set(new Student1(Name,Address,Mob_no,Emailid,Grade,Fees,ID));
           found=true;
	    	}

	    }

        if(!found)
        {
			System.out.println("Record not found");
			}
        else
        {
    		System.out.println("Record update successfully");
	
        }
		System.out.println("========================================================================================================");
	    break;	    
   default:
         System.out.println("wrong choice");
		}
		System.out.println("do u want to continue Y/N");
		scn1.next();
	}
	
	
	
	}
	}







public class Teacher
{
	public static void main(String[] args) 
	{  
	List<Teacher1> al1=new ArrayList<Teacher1>();

		String Name;
		String Address;
		String Mob_no;
		String Emailid;
		String Subject;
		String Salary;
		int ID;
	     Scanner scn1=new Scanner(System.in);
	     Scanner sc=new Scanner(System.in);
			while(true)
			{
		System.out.println("=========================================================");

		System.out.print("\nYour  Choice  is=:\n1.ADD\n2.DISPLAY\n\n3.DELETE\n\n4.SEARCH\n\n5.UPDATE");
		System.out.println("\n=========================================================");
        System.out.println("Enter the choice: ");
		int num=scn1.nextInt();
		System.out.println("\n=========================================================");

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
		System.out.print("\nSubject: ");
		Subject=sc.next();
		System.out.print("\nSalary: ");
		Salary=scn1.next();
		System.out.println("\nID");
		ID=scn1.nextInt();

	
      al1.add(new Teacher1(Name,Address,Mob_no,Emailid,Subject,Salary,ID));
		break;
		
case 2:
		
			System.out.println("================================================================================================");
			System.out.println("Name"+"\t\t"+"Address"+"\t\t\t"+"Mon_no"+"\t\t\t"+"Emailid"+"\t\t\t"+"Subject"+"\t\t"+"Salary");
			System.out.println("\n=============================================================================================");

		    Iterator<Teacher1> it=al1.iterator();
		    while(it.hasNext())
		    {  
		    	Teacher1 s=it.next();
				System.out.println(s);

		    }
			System.out.println("\n================================================================================================");

             break;
case 3:
       boolean found=false;
	   System.out.println("Enter a ID to delete ");
	    ID=scn1.nextInt();
		System.out.println("=======================================================================================================");
		it=al1.iterator();
	    while(it.hasNext())
	    {  
	    	Teacher1 s=it.next();
        if(s.getID()==ID)
	    	{
			it.remove();
           found=true;
	    	}

	    }

       if(!found)
       {
			System.out.println("Record not found");

      	 
       }
       else
       {
    	   System.out.println("Record is deleted");
       }
		System.out.println("============================================================================================================");

         break;
	   
case 4:
		 found=false;
		  System.out.println("Enter a ID to search ");
		    ID=scn1.nextInt();
			System.out.println("===========================================================================================================");
			it=al1.iterator();
		    while(it.hasNext())
		    {  
		    	Teacher1 s=it.next();
              if(s.getID()==ID)
		    	{
      			System.out.println(s);
                 found=true;
		    	}

		    }

             if(!found)
             {
     			System.out.println("Record not found");

            	 
             }
 			System.out.println("===============================================================================================================");
		    break;
case 5:
	 found=false;
	  System.out.println("Enter a ID to update ");
	    ID=scn1.nextInt();
		System.out.println("====================================================================================================================");
		ListIterator<Teacher1>li=al1.listIterator();
	    while(li.hasNext())
	    {  
	    	Teacher1 s=li.next();
         if(s.getID()==ID)
	    	{
        	 System.out.print("\nName: ");
     		Name=scn1.next();
     		System.out.print("\nAddress: ");
     		Address=scn1.next();
     		System.out.print("\nMob_no: ");
     		Mob_no=scn1.next();
     		System.out.print("\nEmailid: ");
     		Emailid=scn1.next();
     		System.out.print("\nSubject: ");
     		Subject=sc.next();
     		System.out.print("\nSalary: ");
     		Salary=scn1.next();
     		System.out.println("\nID");
     		ID=scn1.nextInt();
           li.set(new Teacher1(Name,Address,Mob_no,Emailid,Subject,Salary,ID));
           found=true;
	    	}

	    }

        if(!found)
        {
			System.out.println("Record not found");
			}
        else
        {
    		System.out.println("Record update successfully");
	
        }
		System.out.println("========================================================================================================");
	    break;	    
   default:
         System.out.println("wrong choice");
		}
		System.out.println("do u want to continue Y/N");
		scn1.next();
	}
	
	
	
	}
	}










