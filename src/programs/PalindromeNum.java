package programs;


public class PalindromeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int n = 121;
		int rem;
		int rev = 0;
		int temp = n;
		
		while(n>=1)
		{
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		
		if(temp == rev)
		{
			System.out.println("YESS.. its a palindrome");
		}
		else System.out.println("NO..Its not a palindrome");
		
	}

}
