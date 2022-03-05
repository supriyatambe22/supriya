package collection;
import java.util.TreeSet;
import java.util.Iterator;

public class Tset {

	public static void main(String[] args)
	{
     TreeSet<String> tree=new TreeSet<String>();
     
    tree.add("supriya");
     tree.add("priya");
     tree.add("riya");
     tree.add("shraddha");
     Iterator iterator=tree.iterator();
     while(iterator.hasNext())
     {
       System.out.println(iterator.next().toString());
	}

}
}