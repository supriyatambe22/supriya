package collectionAssingment;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Vector;
class Emp
{
	 private int id;
	 private String name;
	 private String address;
	 private Double salary;
	public Emp(int id,String name,String address,Double salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
		
	}
	public int  getId()
	{
		return id;
	}
    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class Ass8 {

	public static void main(String[] args)
	{
  Vector<Emp> list=new Vector<>();
  list.add(new Emp(1,"priya"," 67,street ,yeola",200000.90));
  list.add(new Emp(2,"riya"," 67,street,chakan",280000.90));
  list.add(new Emp(3,"supriya"," 67,street,nashik",270000.90));
  list.add(new Emp(4,"priyanka"," 67,street,nagar",206000.90));
	
	Iterator<Emp> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

}
}