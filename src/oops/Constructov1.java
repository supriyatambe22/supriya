package oops;
class Stud {
	int id;
	String name;
	public Stud(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void show()
	{
		System.out.println(id+""+name);
	}
}
public class Constructov1 {

	public static void main(String[] args) 
	{
	Stud obj=new Stud(21,"supriya");
	Stud obj1=new Stud(1,"priya");
    obj.show();
    obj1.show();
}

}
