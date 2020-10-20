package programs;

public class SecondLargeSmall 
{
public void bubbleSortComputation(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0){
				break;
			}
		}
	}
	void SecondLargest(int arr[])
	{
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>first)
			{
				second = first;

				first = arr[i];
				
			}
			else if(arr[i]>second && arr[i]<first)
			{
				second = arr[i];
			}
		}
		if(second==Integer.MIN_VALUE)
		{
			System.out.println("There is no second largest element");
		}
		
		else
		{
			System.out.println("The second largest element is "+second);
		}
	}
	void SecondSmallest(int arr[])
	{
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<first)
			{
				second = first;

				first = arr[i];
				
			}
			else if(arr[i]<second && arr[i]<first)
			{
				second = arr[i];
			}
		}
		if(second==Integer.MAX_VALUE)
		{
			System.out.println("There is no second smallest element");
		}
		else
		{
			System.out.println("The second smallest element is "+second);
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = {6,12,4,3,1,5,7,9};
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		
		SecondLargeSmall s = new SecondLargeSmall();
		s.SecondLargest(arr);
		s.SecondSmallest(arr);
		s.bubbleSortComputation(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
