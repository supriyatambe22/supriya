package java8;

import java.util.function.Predicate;

public class Predicatedemo {
	public static void main(String args[])
	{
	Predicate <Integer>p=t->(t%2==0);
System.out.println(p.test(6));
System.out.println(p.test(2));


int[]num={2,3,4,5,6};
Predicate<Integer>even=x->x%2==0;
Predicate<Integer>grt=y->y>5;;

for(int i:num)
{
//	if(even.test(i))
//	{
//		System.out.println(i);
//	}
	if(grt.or(even).test(i))
	{
		System.out.println(i);

	}
}
	}
}
