package collectionAssingment;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;


public class Ass3 {
	
		public static void main(String[] args)
		{
			List<String> list = new ArrayList<>();
			list.add("riya");
			list.add("piya");
			list.add("siya");
			list.add("diya");
			
			printAll(list);
		}

		public static void printAll(List<String> list)
		{
			Iterator<String> it = list.iterator();
			
			while (it.hasNext())
			{
				System.out.println(it.next());
			}
		}

}
