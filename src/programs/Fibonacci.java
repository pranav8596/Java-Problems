package programs;




public class Fibonacci
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n3;
		int n1 = 0;
		int n2 = 1;
		//System.out.print(n1+" "+n2);

		for(int i=1;i<=20;i++)
		{
			n3 = n1 + n2;
			System.out.print(n3+" ");	
			n1 = n2;
			n2 = n3;
			
		}
	}

}
