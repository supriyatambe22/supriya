package oops;
class Student1 {
	 int rno;
	 static String cname="MSGS";
	 String name;
	 Student1(int r,String n)
	 {
		rno=r;
		name=n;
	 }
	 static void change()
	 {
		 cname="smv";
	 }
	 void show()
	 {
		 System.out.println(rno+" "+name+" "+cname);
	 }
}

public class Smethod {

	public static void main(String[] args)
	{
		Student1.change();
		Student1 s=new Student1(1,"riya");
		Student1 s1=new Student1(2,"priya");
          s.show();
          s1.show();


	}

}
