package programs;

public class MaximumElement
{
	public static int findMaximum(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		int arr[] = {7,299,112,114,4,116,8,61};
		System.out.println(findMaximum(arr));
	}

}
