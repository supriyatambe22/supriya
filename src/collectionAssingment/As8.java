package collectionAssingment;

import java.util.Enumeration;
import java.util.Vector;

public class As8 {

	public static void main(String[] args)
	{
 Vector<String>v=new Vector<String>	();
 v.add("oooooooo");
 v.add("pppppppp");
 v.add("ffffffff");

 v.add("aaaaaaaa");
 Enumeration e=v.elements();
while(e.hasMoreElements())
{
	System.out.println(e.nextElement()+"");
}

 }

}
