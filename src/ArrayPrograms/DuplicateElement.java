package ArrayPrograms;


public class DuplicateElement 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int num = 3;
		int arr[] = {4,2,4,5,2,3,1};
		arr[num] = 10;
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		/*for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);

					break;
				}
			}
		}*/

	}
}
