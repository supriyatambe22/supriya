//wap to sort array to numeric/string data
package Array;
import java.util.Scanner;
public class Assq2 {


	public static void main(String[] args) 
	{ 
		int[] arr= {5,4,84,14};
		System.out.println("array element is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("element is");
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				int temp=0;
				if(arr[j]>arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
				System.out.println(arr[j]);
			}
		}
	}
	