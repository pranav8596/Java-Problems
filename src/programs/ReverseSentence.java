package programs;

public class ReverseSentence
{
	public static String reverse(String sentence)
	{
		if(sentence.isEmpty())
		{
			return sentence;
		}
		return reverse(sentence.substring(1))+sentence.charAt(0);			
	}
	public static void main(String[] args) 
	{

		
		String sentence = "Pranav how are you";
		System.out.println(sentence);
		System.out.println(reverse(sentence));
	}

}
