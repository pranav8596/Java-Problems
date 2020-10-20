package Pattrens;


public class AllPatterns
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Example 1------------------");
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j-- )
			{
				System.out.print("* ");
			}
			System.out.println("");
		}	
		
		
		
		System.out.println("Example 2------------------");
		for (int i= 1; i<= 4; i++)
        {
            for (int j=1; j<=4-i; j++)
            {
                System.out.print("  ");
            }
            	
	            for (int k=1;k<i*2;k++)
	            {
	                System.out.print("* ");
	            } 
            
                System.out.println("");
        }
		
		
		
		System.out.println("Example 3------------------");
		for (int i = 0; i<4; i++) 
		{
			for (int j = 0; j<=i*2; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("Example 4------------------");
		int count=0;
		for (int i = 0; i<=3; i++) 
		{
			for (int j = 0; j<=i; j++) 
			{
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		System.out.println("Example 5------------------");

		for (int i = 1; i <=5 ; i++) 
		{
			for (int j = 1; j <= i ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5 ; i++) 
		{
			for (int j = 4; j >=i; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("Example 6------------------");

		 count=0;
		for (int i = 0; i<=4; i++) 
		{
			for (int j = 0; j<=i; j++) 
			{
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		System.out.println("Example 7------------------");
		for (int i = 1; i <=5; i++)
		{
			for (int j = 5; j >=i+1 ; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(" ");
			}
			for (int k =4; k > i; k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Example 8------------------");

		for (int i= 1; i<= 4; i++)
        {
            for (int j=1; j<=4-i; j++)
            {
                System.out.print("  ");
            }
            	
	            for (int k=1;k<i*2;k++)
	            {
	            	if(k>1 && k<(i*2)-1)
	            	{
	            		System.out.print("  ");
	            	}
	            	else
	            	{
	            		System.out.print(" *");
	            	}
	            } 
            
                System.out.println("");
        }
		
		
		System.out.println("Example 9------------------");
		for (int i = 1; i <=5 ; i++)
		{
			for (int j = 1; j <=5; j++) 
			{
				if(i==j || i+j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Example 10------------------");

		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= 7; j++)
			{
				if(i == 1 || i == 7 || j == 1 || j == 7||i==4)
				{
					System.out.print("*"); 
				}
				else
				{
					System.out.print(" "); 
				}
			}
			System.out.print("\n"); 
		}
		
		System.out.println("Example 11------------------");

		for (int i = 0; i<4; i++) 
		{
			for (int j =1 ; j<=i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 3; k>=i  ; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=2; i<= 4; i++)
        {
            for (int j=1; j<=4-i; j++)
            {
                System.out.print(" ");
            }
            	
	            for (int k=1;k<=i;k++)
	            {
	                System.out.print("* ");
	            } 
            
                System.out.println(" ");
        }
		
		
		System.out.println("Example 11------------------");

		for (int i = 1; i <=5 ; i++) 
		{
			for (int j = 1; j<=5 ; j++) 
			{
				if(i==3||j==3)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}
		
		
		System.out.println("Example 12------------------");
		for (int i = 1; i <=5 ; i++) 
		{
			for (int j = 1; j<=5 ; j++) 
			{
				if(i==1||i==5||j==1||j==5)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}
		System.out.println("Example 13------------------");

		for (int i= 1; i<= 4; i++)
        {
            for (int j=1; j<=4-i; j++)
            {
                System.out.print("  ");
            }
            	
	            for (int k=1;k<i*2;k++)
	            {
	            	if(k==1||k==(i*2)-1||i==4)
	            	{
	            		System.out.print("* ");
	            	}
	            	else
	            	{
	            		System.out.print("  ");
	            	}
	            } 
            
                System.out.println("");
        }
		
		System.out.println("Example 14------------------");

		for (int i = 1; i <=5 ; i++) 
		 {
			for (int j = 1; j <=5 ; j++) 
			{
				if(j==5||j==i||i==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("Example 15------------------");

		for (int i = 1; i <=4; i++) 
		{
			for (int j = 4; j >i ; j--)
			{
				System.out.print("  ");
			}
			for (int k = 1; k <i*2 ; k++) 
			{
				if(k>2 && k<(i*2)-2)
            	{
            		System.out.print("  ");
            	}
            	else
            	{
            		System.out.print("* ");
            	}			
			}
			System.out.println();
		}
		for (int i = 4; i>=1 ; i--)
		{
			for (int j = 4; j>= i; j--) 
			{
				System.out.print("-");
			}
			for (int k = 1; k <=i*2 ; k++) 
			{
				if(k>2 && k<(i*2)-2)
            	{
            		System.out.print("  ");
            	}
            	else
            	{
            		System.out.print("* ");
            	}			
			}
			System.out.println();
			
		}
		
		
		System.out.println("Example 16------------------");

		for (int i = 1; i <=4 ; i++)
		{
			for (int j = 4; j >i ; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <i*2; k++) 
			{
            	if(k==1||k==(i*2)-1)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print(" ");
				}	
			}
				
			System.out.println();
		}
		
		for (int i = 3; i >=1 ; i--)
		{
			for (int j = 3; j >=i ; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k<i*2; k++) 
			{
				if(k>1&&k<i*2-1)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("Example 17------------------");

		 for(int i=1;i<=5;i++)
	        {
	            for(int j=5;j>i;j--)
	            {
	            	System.out.print(" ");
	            }
	           for(int k=1;k<=i;k++)
	            {
	        	   if(k>2&&k<=i-2)
	        	   {
	        		   System.out.print("  ");
	        	   }
	        	   else
	        	   {
	        		   System.out.print("* "); 
	        	   }
	            }
	             System.out.print("\n");
	        }     
	         for(int i=1;i<=5-1;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print(" ");
	            }
	           for(int k=5-1;k>=i;k--)
	            {
	               System.out.print("* "); 
	            }
	             System.out.print("\n");
	        }    


		

		


	}

}
 