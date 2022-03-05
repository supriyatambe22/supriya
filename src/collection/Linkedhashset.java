package collection;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args)
	{

LinkedHashSet<String> lhs=new LinkedHashSet<String>();
lhs.add(new String("one"));
lhs.add(new String("two"));
lhs.add(new String("three"));
Object array[]=lhs.toArray();
for(int x=0;x<3;x++)
{
	System.out.println(array[x]);
}


	}

}
