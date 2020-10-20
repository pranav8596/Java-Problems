package StringPrograms;


public class ReverseWithoutRecurr 
{
	void reverse(String str)
	{
		int len = str.length();
		String rev="";
		for (int i = len-1; i >=0 ; i--) 
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}	
	

	
	public static void main(String[] args) 
	{
		ReverseWithoutRecurr r = new ReverseWithoutRecurr();
		String str = "PRANAV";

		r.reverse(str);
				
			
	}

}
