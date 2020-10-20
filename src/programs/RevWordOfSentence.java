package programs;

public class RevWordOfSentence 
{
	public void reverse(String str)
	{
		String words[] = str.split(" ");
		
		String revString = "";
		for (int i = 0; i < words.length; i++) 
		{
			String revWord = "";
			String word = words[i];
			for (int j = word.length()-1; j >=0; j--) 
			{
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord+" ";
			
		}
		System.out.println(str);
		System.out.println(revString);
	}
	
	public static void main(String[] args) 
	{
		RevWordOfSentence s = new RevWordOfSentence();
		String str = "Hello pranav! Welcome to bridgelabz";
		s.reverse(str);

	}

}
