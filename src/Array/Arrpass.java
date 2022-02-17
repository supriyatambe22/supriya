package Array;

public class Arrpass {

	private static void printArray(int[] arr)
	{
      System.out.println("Array contents printed through");
      for(int i=0;i<arr.length;i++)
      {0    	  System.out.println(arr[i]+"");
      }
	}
     public static void main(String args[])
     {
    	 int[] intArray= {10,6,8,90,9};
    	 printArray(intArray);
     }
}
