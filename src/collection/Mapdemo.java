package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args)
	{
		Map<Integer,String>obj=new HashMap<Integer,String>();
		obj.put(new Integer(102),"supriya");
		obj.put(new Integer(101),"priya");
		obj.put(new Integer(103),"riya");
         Set s=obj.entrySet();
         Iterator itr=s.iterator();
         while(itr.hasNext())
         {
        	 Map.Entry me=(Map.Entry)itr.next();
        	 System.out.println(me.getKey()+""+me.getValue());
         }
	}

}
