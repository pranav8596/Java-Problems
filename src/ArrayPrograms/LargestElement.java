package ArrayPrograms;


public class LargestElement
{
	public static int getMaximum(int array[]) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) 
	{
		int array[] = {4,5,8,6,5444,9,25,45,75,45};
		System.out.println("Maximum: "+getMaximum(array));
	}
}
