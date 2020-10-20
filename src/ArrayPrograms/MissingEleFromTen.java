package ArrayPrograms;


public class MissingEleFromTen 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int arr[] = {0,1,2,3,5,7,8,9,10};
		
		for (int i = 0; i <=10; i++) 
		{
			int temp=0;
			for (int j = 0; j <arr.length; j++) 
			{
				if(arr[i]==j)
				{
					temp = 1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
		}
	}

}
