package java8;

import java.util.function.Predicate;

public class Functionalisequal {

	public static void main(String[] args) 
	{
		Predicate<String>name=Predicate.isEqual("supriya");
          System.out.println(name.test("supriya"));
	}

}
