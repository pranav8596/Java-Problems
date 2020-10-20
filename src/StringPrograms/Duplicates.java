package StringPrograms;


public class Duplicates
{

	public static void main(String[] args) 
	{
		String str = "pranav";
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) 
		{
		

			for (int j = i+1; j < arr.length; j++) 
			{
				
				if(arr[i]==arr[j]&&i!=j)
				{
					System.out.println("Duplicate element is: "+arr[i]);
				}
				
				
			}
			
		}
		
		
	}

}
