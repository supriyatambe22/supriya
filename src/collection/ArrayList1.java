package collection;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args)
	{
      ArrayList alist=new ArrayList();
      alist.add(new String("one"));
      alist.add(new String("two"));
      alist.add(new String("three"));
      alist.add(new String("four"));
      System.out.println(alist.get(0));
      System.out.println(alist.get(1));
      System.out.println(alist.get(2));
      System.out.println(alist.get(3));
	}

}
