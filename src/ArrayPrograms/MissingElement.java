package ArrayPrograms;


public class MissingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int arr1[] = {1,2,3,4};
		int arr2[] = {8,4,3,6,1};
		
		for (int i = 0; i < arr1.length; i++)
		{
			int temp = 0;
			for (int j = 0; j < arr2.length; j++) 
			{
				if(arr1[i]==arr2[j])
				{
					 temp = 1;
					 break;
				}
			}
			if(temp==0)
			{
				System.out.println("missing element: "+arr1[i]+" ");
			}
		}
		
		

		
	}

}
