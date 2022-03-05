package collection;
import java.util.*;
public  class Treemap {
	public static void main(String args[])
	{
		TreeMap treeMap=new TreeMap();
		treeMap.put("name","supriya");
		treeMap.put("college","msgs");
		treeMap.put("rno",new Integer(2));
		
      Collection values=treeMap.values();
      Iterator iterator=values.iterator();
      System.out.println("printing the values");
      while(iterator.hasNext())
      {
    	  System.out.println(iterator.next());
      }
	}

}
