package oops;
 class Student {
	 int rno;
	 static String cname="MSGS";
	 String name;
	 Student(int r,String n)
	 {
		rno=r;
		name=n;
	 }
	 void show()
	 {
		 System.out.println(rno+" "+name+" "+cname);
	 }
 }

public class Svariable {

	public static void main(String[] args)
	{
		Student s=new Student(1,"riya");
		Student s1=new Student(2,"priya");
          s.show();
          s1.show();

	}

}
