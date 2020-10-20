package programs;
import java.util.Scanner;
import java.util.Arrays;

public class triplates{
     static void find(int arr[],int n,int sum) 
     {
    	 boolean found = true;
    	for(int i=0; i<=n-2; i++)
    	{
    		for(int j=i+1; j<=n-1; j++) 
    		{
    			for(int k=j+1; k<n; k++) 
    			{
    				if(arr[i]+arr[j]+arr[k]==sum) 
    				{
    					System.out.print("\ntriple is:"+arr[i]+","+arr[j]+","+arr[k]);
    					found = false;
    				}
    				
    			}
    		}
    	} 
    	if(found == true)
    	{
    		System.out.println("Not exists");
    	}
		

     }	

public static void main(String args[]) 
{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the length of Array:");
   int n=s.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter the elements of Array:");
   
   for(int i=0; i<n ;i++) 
   {
	arr[i]=s.nextInt();   
   }
   System.out.println("Enter the sum:");
   int a=s.nextInt();
   find(arr,n,a);
}
}	

