package java8;
interface A
{
	public int add(int x,int y);
	public  static void show()
	{
		System.out.println("hello");
	}
}
public class Lamdaexp {

	public static void main(String[] args) {
		A obj=(x,y)-> (x+y);
        System.out.println(obj.add(5,2));
    
     A.show();
	}
}