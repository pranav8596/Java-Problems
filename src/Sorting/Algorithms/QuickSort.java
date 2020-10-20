package Sorting.Algorithms;


public class QuickSort 
{

	void sort(int arr[], int low, int high)
	{
		int i = low;
		int j = high;
		int pivot = arr[(high+low)/2];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		if(low<j)
		{
			sort(arr, low, j);
		}
		if(high>i)
		{
			sort(arr,i, high);
		}
		
	}
	public static void main(String[] args) 
	{
		
		int arr[] = {6, 5, 3, 1, 10, 8, 7, 2, 9};
		System.out.print("Unsorted array: ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		QuickSort alg = new QuickSort();
		alg.sort(arr,0, arr.length-1);
		
		System.out.print("Sorted array:   ");

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");

			
		}
	}

}
