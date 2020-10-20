package StringPrograms;


public class RevereStringRecurr 
{
	static String reverse( String str)
	{
		if(str==null||str.length()<=1)
		{
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String[] args) 
	{
		String str = "pranav";
		System.out.println(reverse(str));
	}
}
