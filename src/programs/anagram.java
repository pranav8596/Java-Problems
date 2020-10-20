package programs;
import java.io.*; 
import java.util.Arrays; 
public class anagram {

	

    
    static void  areAnagram(String str1, String str2) 
    { 
    	boolean status;
        int n1 = str1.length(); 
        int n2 = str2.length(); 
  
       
        if (n1 != n2) 
            status =  false; 
        else
        {
        	char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }
  
     
       
        if(status)
        {
            System.out.println(str1+" and "+str2+" ARE anagram of each other"); 
         }
        else
        {
            System.out.println(str1+" and "+str2+" are NOT anagram of each other"); 

        }
    } 
  
    public static void main(String args[]) 
    { 
       areAnagram("earth", "heart") ;
       
    } 
}


