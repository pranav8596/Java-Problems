package programs;


public class AmstrongNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int n = 153;
		int a;
		int c= 0;
		int temp = n;
		
		while(n>=1)
		{
			a = n%10;
			c = c+(a*a*a);
			n = n/10;                        
		}
		
		if(temp == c)
		{
			System.out.println("YESS.. its a Amstrong");
		}
		else System.out.println("NO..Its not a Amstrong");
		
	}

}
