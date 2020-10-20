package programs;


public class PalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String str = "NITIN";
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("YES! Its a palindrome");
		}
		else
		{
			System.out.println("N0! Its not a palindrome");
		}
	}

}
