package Sorting.Algorithms;


public class BubbleSort 
{
	void bubbleSort(int arr[])
	{
		int temp;
		for (int i = 0; i < arr.length-1; i++)
		{
			//int flag = 0;
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					//flag = 1;
				}
			}
		/*	if(flag==0)
			{
				break;
			}*/
		}
	}
	public void display(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args)
	{	
		BubbleSort b = new BubbleSort();
		int arr[] = {6,9,1,12,15};
		
		System.out.println("array before sorting: ");
		b.display(arr);
		System.out.println();
		b.bubbleSort(arr);
		System.out.println("array after sorting: ");
		b.display(arr);
	}

}
