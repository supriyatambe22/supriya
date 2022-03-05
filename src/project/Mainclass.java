
package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// Student student = new Student();
		List<Student> al1 = new ArrayList<Student>();
		List<Teacher> al=new ArrayList<Teacher>();

		Scanner scn1 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		char ch;

		do
		{System.out.println("=========================================================");

		System.out.print("\nYour  Choice  is=:\n1.STUDENT\n2.TEACHER");
		System.out.println("\n=========================================================");
		System.out.println("Enter the choice: ");
		int num = sc.nextInt();
		System.out.println("\n=========================================================");
         switch(num)
         {
         
         
         case 1:
        	 
        	 String Name;
     		String Address;
     		String Mob_no;
     		String Emailid;
     		String Grade;
     		String Fees;
     		String ID;
     		
        	 

     		do {
     			System.out.println("=========================================================");

     			System.out.print("\nYour  Choice  is=:\n1.ADD\n2.DISPLAY\n\n3.DELETE\n\n4.SEARCH\n\n5.UPDATE");
     			System.out.println("\n=========================================================");
     			System.out.println("Enter the choice: ");
     			 num = sc.nextInt();
     			System.out.println("\n=========================================================");

     			switch (num) {
     			case 1:

     				System.out.print("\nName: ");
     				Name = scn1.next();
     				System.out.print("\nAddress: ");
     				Address = scn1.next();
     				System.out.print("\nMob_no: ");
     				Mob_no = scn1.next();
     				System.out.print("\nEmailid: ");
     				Emailid = scn1.next();
     				System.out.print("\nGrade: ");
     				Grade = scn1.next();
     				System.out.print("\nFees: ");
     				Fees = scn1.next();
     				System.out.println("\nID");
     				ID = scn1.next();

     				al1.add(new Student(Name, Address, Mob_no, Emailid, Grade, Fees, ID));
     				break;

     			case 2:

     				System.out.println(
     						"================================================================================================");
     				System.out.println("Name" + "\t\t" + "Address" + "\t\t\t" + "Mon_no" + "\t\t\t" + "Emailid" + "\t\t\t"
     						+ "Grade" + "\t\t" + "Fees" + "\t\t" + "ID");
     				System.out.println(
     						"\n=============================================================================================");
     				for (Student s : al1) {
     					System.out.println(s.toString());
     				}

     				Iterator<Student> it = al1.iterator();
//     				while (it.hasNext()) {
//     					Student s = it.next();
//     					System.out.println(s);
     //
//     				}
     				System.out.println(
     						"\n================================================================================================");

     				break;
     			case 3:
     				boolean found = false;
     				System.out.println("Enter a ID to delete ");
     				ID = scn1.next();
     				System.out.println(
     						"=======================================================================================================");
     				it = al1.iterator();
     				while (it.hasNext()) {
     					Student s = it.next();
     					if (s.getID().equalsIgnoreCase(ID)) {
     						it.remove();
     						found = true;
     						break;
     					}

     				}

     				if (!found) {
     					System.out.println("Record not found");

     				} else {
     					System.out.println("Record is deleted");
     				}
     				System.out.println(
     						"============================================================================================================");

     				break;

     			case 4:
     				found = false;
     				System.out.println("Enter a ID to search ");
     				ID = scn1.next();
     				System.out.println(
     						"===========================================================================================================");

//                     it = al1.iterator();
//     				while (it.hasNext()) {
//     					Student s = it.next();
     				for (Student s : al1) {
     					if (s.getID().equalsIgnoreCase(ID)) {
     						System.out.println(s.toString());
     						found = true;
     						break;
     					}

     				}

     				if (!found) {
     					System.out.println("Record not found");

     				}
     				System.out.println(
     						"===============================================================================================================");
     				break;
     			case 5:
     				found = false;
     				System.out.println("Enter a ID to update ");
     				ID = scn1.next();
     				System.out.println(
     						"====================================================================================================================");
     				for (Student s : al1) {
     					if (s.getID().equalsIgnoreCase(ID)) {
     						System.out.print("\nName: ");
     						Name = scn1.next();
     						System.out.print("\nAddress: ");
     						Address = scn1.next();
     						System.out.print("\nMob_no: ");
     						Mob_no = scn1.next();
     						System.out.print("\nEmailid: ");
     						Emailid = scn1.next();
     						System.out.print("\nGrade: ");
     						Grade = scn1.next();
     						System.out.print("\nFees: ");
     						Fees = scn1.next();
     						System.out.println("\nID");
     						ID = scn1.next();
     						al1.set(al1.indexOf(s), new Student(Name, Address, Mob_no, Emailid, Grade, Fees, ID));
     						found = true;
     					}

     				}

     				if (!found) {
     					System.out.println("Record not found");
     				} else {
     					System.out.println("Record update successfully");

     				}
     				System.out.println(
     						"========================================================================================================");
     				break;

     			default:
     				System.out.println("wrong choice");
     			}
     			System.out.println("do u want to continue Y/N");
     			ch = scn1.next().charAt(0);
     		} while (ch == 'y');

        	 break;
         case 2:
        	 
        	 
        	 
        	 String TName;
		  String TMob_no;
		 String TEmailid;
			 String TAddress;
		     String TSubject;
		     String TSalary;
		     String TID;
	    
        	 
        	
     			do{
     		System.out.println("=========================================================");

     		System.out.print("\nYour  Choice  is=:\n1.ADD\n2.DISPLAY\n\n3.DELETE\n\n4.SEARCH\n\n5.UPDATE");
     		System.out.println("\n=========================================================");
             System.out.println("Enter the choice: ");
     		 num=scn1.nextInt();
     		System.out.println("\n=========================================================");

     		switch(num)
     		{
     case 1:
     		
     		System.out.print("\nName: ");
     		TName=scn1.next();
     		System.out.print("\nAddress: ");
     		TAddress=scn1.next();
     		System.out.print("\nMob_no: ");
     		TMob_no=scn1.next();
     		System.out.print("\nEmailid: ");
     		TEmailid=scn1.next();
     		System.out.print("\nSubject: ");
     		TSubject=sc.next();
     		System.out.print("\nSalary: ");
     		TSalary=scn1.next();
     		System.out.println("\nID");
     		TID=scn1.next();

     	
           al.add(new Teacher(TName,TAddress,TMob_no,TEmailid,TSubject,TSalary,TID));
     		break;
     		
     case 2:
     		
     			System.out.println("================================================================================================");
     			System.out.println("Name"+"\t\t"+"Address"+"\t\t\t"+"Mon_no"+"\t\t\t"+"Emailid"+"\t\t\t"+"Subject"+"\t\t"+"Salary");
     			System.out.println("\n=============================================================================================");

     		    Iterator<Teacher> it=al.iterator();
     		    while(it.hasNext())
     		    {  
     		    	Teacher s=it.next();
     				System.out.println(s);

     		    }
     			System.out.println("\n================================================================================================");

                  break;
     case 3:
            boolean found=false;
     	   System.out.println("Enter a ID to delete ");
     	    ID=scn1.next();
     		System.out.println("=======================================================================================================");
     		it=al.iterator();
     		while (it.hasNext())
     		{
					Teacher s = it.next();
					if (s.getID().equalsIgnoreCase(ID))
					{
						it.remove();
						found = true;
						break;
					
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
     		    ID=scn1.next();
     			System.out.println("===========================================================================================================");
     			
     		    	for (Teacher s : al) {
     					if (s.getID().equalsIgnoreCase(ID))
     					{
     						System.out.println(s.toString());
     						found = true;
     						break;
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
     	    ID=scn1.next();
     		System.out.println("====================================================================================================================");
     		for(Teacher s:al)
     	    	{
     			if(s.getID().equalsIgnoreCase(ID))
     			{
             	 System.out.print("\nName: ");
          		TName=scn1.next();
          		System.out.print("\nAddress: ");
          		TAddress=scn1.next();
          		System.out.print("\nMob_no: ");
          		TMob_no=scn1.next();
          		System.out.print("\nEmailid: ");
          		TEmailid=scn1.next();
          		System.out.print("\nSubject: ");
          		TSubject=scn1.next();
          		System.out.print("\nSalary: ");
          		TSalary=scn1.next();
          		System.out.println("\nID");
          		TID=scn1.next();
                al.set(al.indexOf(s),new Teacher(TName,TAddress,TMob_no,TEmailid,TSubject,TSalary,TID));
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
    		ch = scn1.next().charAt(0);
    	} while (ch == 'y');
        	   	 break;
        	 default:
        		 System.out.println("wrong choice");
         }
			
		System.out.println("do u want to continue Y/N");
		ch = scn1.next().charAt(0);
	} while (ch == 'y');

	}

}
