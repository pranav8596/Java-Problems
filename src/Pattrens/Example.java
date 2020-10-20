package Pattrens;

import java.util.Scanner;


public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <=4; i++) 
		{
			for (int j = 4; j>i; j--) 
			{
				System.out.print("  ");
			}
			for (int k = 1; k <i*2; k++) 
			{
				if(k>1&&k==i)
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
		
		/*for (int i = 4; i >=1 ; i--)
		{
			for (int j = 4-1; j>= i; j--) 
			{
				System.out.print("  ");
			}
			for (int k = 1;k <i*2; k++) 
			{
				if(k>1&k==i)
				{
					System.out.print("  ");
				}
				else
				{
				System.out.print("* ");
				}
			}
			System.out.println();
		}*/
	}

}
