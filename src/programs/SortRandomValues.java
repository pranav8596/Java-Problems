package programs;

import java.util.Random;

public class SortRandomValues 
{

	public static void main(String[] args) 
	{

		int count=0;
		int arr[]=new int[30];
		Random r = new Random();
		for (int i = 0; i < 30; i++)
		{
			 arr[i]=r.nextInt(30);
			 count++;
			 System.out.print(arr[i]+" ");
			 
		}
		System.out.println();


		int temp;
		for (int i = 0; i < arr.length-1; i++)
		{
			int flag = 0;
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			
		
		System.out.print(arr[i]+" ");
		}
		
	}

}
