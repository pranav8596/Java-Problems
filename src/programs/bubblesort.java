package programs;

import java.util.Scanner;

public class bubblesort
{
	
	 
	    public static void main(String args[])
	    {
	     
	    	Scanner sc = new Scanner(System.in);
			 System.out.println("Input number of integers to sort");
			    int n = sc.nextInt();
				int a[] = new int[n];

			 
			    System.out.println("Enter " + n + " integers");
			 
			    for (int c = 0; c < n; c++)
			    {
			      a[c] = sc.nextInt();
			    }
		        for (int i = 0; i < n-1; i++)
		            for (int j = 0; j < n-i-1; j++)
		   
		            	if (a[j] > a[j+1])
		                {
		                    int temp = a[j];
		                    a[j] = a[j+1];
		                    a[j+1] = temp;
		                }
		    
		        System.out.println("Sorted array is: ");                      
		        for (int i=0; i<n; ++i)
		        {
		            System.out.print(a[i] + " ");
		        }
		        sc.close();
		    }
	    	
	    
	}