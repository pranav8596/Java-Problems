package ArrayPrograms;


public class Occourances 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int arr[] = {1,2,1,3,1,3,2,3,4};
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 0;

			
			for (int j = 0; j < arr.length; j++) 
			{
				if(j<i&&arr[i]==arr[j])
				{
					break;
				} 

				if(arr[i]==arr[j])
				{			
					count++;
				}
	
			}
			if(count!=0)
			{
				System.out.println(arr[i]+"="+count);

			}

		}
		
	}

	
}


