package collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args)
	{
     LinkedList alist=new LinkedList();
     alist.add(new String("one"));
     alist.add(new String("two"));
     alist.add(new String("three"));
     System.out.println(alist.get(0));
     System.out.println(alist.get(1));
     System.out.println(alist.get(2));

	}

}
