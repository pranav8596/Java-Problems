package StringPrograms;

import java.util.Arrays;


public class DemoSort {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int arr[] = {2,8,6,9,7};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
