package java8;

import java.util.ArrayList;
import java.util.Collections;

public class Usingcomparable {

	public static void main(String[] args)
	{
		ArrayList<Usingcomparable1>arr=new ArrayList<Usingcomparable1>();
		arr.add(new Usingcomparable1(1,"supriya",22));
		arr.add(new Usingcomparable1(2,"priya",20));
		arr.add(new Usingcomparable1(3,"riya",25));
		Collections.sort(arr);
		for(Usingcomparable1 uc:arr)
		{
			System.out.println(uc.rollno+""+uc.name+""+uc.age);
		}

	}

}

class Usingcomparable1 implements Comparable<Usingcomparable1>
{
	int rollno;
	String name;
	int age;
	Usingcomparable1(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Usingcomparable1 uc)
	{
		if(age==uc.age)
		
			return 0;
		return age;
		
	}
}