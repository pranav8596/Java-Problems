package programs;

import java.util.Scanner;

public class Stopwatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enet any key to start");
		String s1 = sc.nextLine();
		long starttime = System.currentTimeMillis();
		
		System.out.println("Enter any key to end");
		String s2 = sc.nextLine();
		long endtime = System.currentTimeMillis();

		System.out.println(starttime);
		System.out.println(endtime);
		double time = (endtime-starttime)/1000.0;
		
		System.out.println("Elapsed time: "+time);
	}

}
