package Array;
// copy array element
public class ass4 {

	public static void main(String[] args)
	{

		int[] arr= {5,4,84,14};
		int a1[]=new int[arr.length];
	
		for(int i=0;i<arr.length;i++)
		{
		a1[i]=arr[i];
		}
		System.out.println("array element is");
		   
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println(" element of new array");
		for(int i=0;i<a1.length-1;i++)
		{
			System.out.println(a1[i]);
		}
		          
	}

	
}
