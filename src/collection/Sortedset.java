package collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) 
	{
  SortedSet<String> ss=new TreeSet<String>();
  ss.add("suyog");
  ss.add("yash");
  ss.add("Tejas");
  
  Iterator iterator=ss.iterator();
  while(iterator.hasNext())
  {
    System.out.println(iterator.next().toString());
	}

	}

}
