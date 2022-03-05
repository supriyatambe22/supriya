package collectionAssingment;
//
import java.util.ArrayList;
public class Ass1 {
    int i;
		ArrayList<Integer> list=new  ArrayList<Integer>();
        public ArrayList<Integer> saveEvenNumber(int N)
        {
        	
        list=new ArrayList<Integer>();
        for(i=2;i<=N;i++) 
        {
        	if(i%2==0)
        	{
        		list.add(i);
        	}
        }
        	return list;
        
        }
        public ArrayList<Integer> printEvenNumber()
        
        {
    		ArrayList<Integer>newList=new  ArrayList<Integer>();
           for(int item:list)
           {
        	   newList.add(item*2);
        	   System.out.println(item*2);        
           }
           return newList;
        }
        

	public static void main( String args[])
	{
		Ass1 as=new Ass1();
		as.saveEvenNumber(10);
		as.printEvenNumber();
	}

}
