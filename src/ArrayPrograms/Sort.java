package ArrayPrograms;


public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		int arr[] = {2,1,7,3,6,8,4};
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
