package ArrayPrograms;

import java.util.Arrays;


public class BinarySearchString {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		String arr[] = {"geeks","contribute", "ide", "practice"};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	

		
		String find = "geeks";
		System.out.println("to find = "+find);
		int l =0;
		int h = arr.length-1;
		
		int mid = (l+h)/2;
		
		while(l<=h)
		{
			int res = find.compareTo(arr[mid]);			
			if(res==0)
			{
				System.out.println("found at "+mid);
				break;
			}
			else if(res>0)
			{
				l = mid+1;
			}
			if(res<0)
			{
				h = h-1;
			}
			 mid = (l+h)/2;

		}
		if(l>h)
		{
			System.out.println("not found");
		}
	}

}
