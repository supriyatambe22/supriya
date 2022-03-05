package collection;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args)
	{
   HashMap<String,String> map =new HashMap(String,String);
   map.put("suyog", "A");
   map.put("atul", "C");
   map.put("yash", "B");
   System.out.println("Name:"+map.get("suyog"));
   System.out.println("Name:"+map.get("atul"));
   System.out.println("Name:"+map.get("yash"));



	}

}
