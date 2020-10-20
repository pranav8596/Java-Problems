package ArrayPrograms;


public class CommonElements 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String arr1[] = {"ONE", "TWO", "THREE"};
		String arr2[] = {"FOUR", "ONE", "FIVE", "THREE"};
		
		int flag=0;
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr2.length; j++) 
			{
				if(arr1[i]==arr2[j])
				{
					flag=1;
					System.out.println(arr1[i]);
				}
				
			}
		}
		if(flag==0)
		{
			System.out.println("Nothing is common");
		}
		
	}

}
