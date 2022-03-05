package String;
import java.util.*;
public class Removingdublicates {

	static String removeduplicate(char str[], int n)
	{
		int index = 0;
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = 0; j < i; j++)
			{
				if (str[i] == str[j])
				{
					break;
				}
			}
			if (j == i)
			{
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}
	
	public static void main(String[] args) 
	{
		char str[] = "GoodMorning_GoodAfternoon_GoodEvening_GoodNight".toCharArray();

		int n = str.length;

		System.out.println(removeduplicate(str, n));

	}



}
