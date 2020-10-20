package ArrayPrograms;


public class TargetValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int n = 7;
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.println(a[i]+"+"+a[j]+"="+n);
					System.out.println("index of "+a[i]+" and "+a[j]+" is "+i+" and "+j);
					System.out.println();
				}
			}
		}
		
	}

}
