package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

 class Teacher {
	private String Name;
	private String Address;
	private  String Mob_no;
	private String Emailid;
    private String Subject;
    private String Salary;
    private String ID;
	public Teacher(String Name, String Address, String Mob_no, String Emailid,String Subject,String Salary,String ID) 
	{

		this.Name = Name;
		this.Mob_no = Mob_no;
		this.Address = Address;
		this.Emailid = Emailid;
		this.Subject=Subject;
		this.Salary=Salary;
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
	public String getSubject() {
		return Subject;
	}

	public void setSubject(String Subject) {
		this.Subject = Subject;
	}
	public String getSalary() {
		return Salary;
	}

	public void setSalary(String Salary) {
		this.Salary = Salary;
	}
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}


	public String toString() {
return this.Name + "\t\t" + this.Address + "\t\t\t" + this.Mob_no + "\t\t\t" + this.Emailid+ "\t\t\t" + this.Subject+ "\t\t" + this.Salary + this.ID;
	}
}
