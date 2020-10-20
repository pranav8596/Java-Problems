package programs;

import java.util.Scanner;

public class LeapYear {

	public  static void leapYear(int year) {
		boolean isLeap;
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			isLeap = true;
		}
		else 
		{
			isLeap = false;
		}

		if(isLeap==true)
		{
			System.out.println(year + " is a Leap Year.");
		}
		else
		{
			System.out.println(year + " is not a Leap Year.");
		}
	}
	public static void main(String[] args)
	{

		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Year:");
		year = scan.nextInt();
		leapYear(year);



	}

}
