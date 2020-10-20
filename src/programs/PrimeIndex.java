package programs;

public class PrimeIndex 
{
	static boolean isPrime(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}			
		}
		return true;
	}
	static void primeIndex(int arr[])
	{
		System.out.println("Element\tPosition");
		
		for(int i=2; i<=arr.length; i++)
		{
			if(isPrime(i))
			{
				System.out.print(arr[i-1]+"\t");
				System.out.println("  "+i+"\t");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int arr[]= {10,3,5,7,9,11,13,15,17,19,21};
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		primeIndex(arr);
	}
}
