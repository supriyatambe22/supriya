//hashset

package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hset {

	public static void main(String[] args)
	{
     Set hash=new HashSet();
     hash.add("a");
     hash.add("b");
     hash.add("c");
     hash.add("d");
     hash.add("e");
     hash.add("f");
     hash.add("g");
     Iterator iterator=hash.iterator();
     while(iterator.hasNext())
     {
    	 System.out.println(iterator.next());
     }

	}

}
