package collectionAssingment;

import java.util.ArrayList;
import java.util.List;

class MyArray<E> extends ArrayList<E>
{
@Override
public boolean add(E e)
{
	if(e instanceof Integer||e instanceof Double|| e instanceof Float)
	{
		super.add(e);
		return true;
	}
	else
	{
		throw new ClassCastException(" Integer,Double,Float");
	}
}
	
}
public class Ass4 {

	public static void main(String[] args) 
	{
List<Object>list=new MyArray<>();
try
{
	list.add(10);
	list.add(90.09);
	list.add(1.7F);
	list.add("abc");
}
catch(Exception e)
{
	e.printStackTrace();
}
System.out.println(list);


	}

}
