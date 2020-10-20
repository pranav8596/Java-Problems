package ArrayPrograms;


public class BinarySearch {
	public static void main(String[] args) 
	{
		int arr[] = {1,2,4,6,7,9,10,12,15};
		int n = 7;
		int low = 0;
		int high = arr.length-1;
		
		int mid = (low+high)/2;
		
		while(low<=high)
		{
			if(arr[mid]==n)
			{
				System.out.println("element found at index no "+mid);
				break;
			}
			else if(arr[mid]>n)
			{
				high = mid-1;
			}
			if(arr[mid]<n)
			{
				low = mid+1;
			}
			 mid =(low+high)/2;
		}
		if(low>high)
		{
			System.out.println("Element not found");
		}
	}

}
