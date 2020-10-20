package programs;

import java.util.Random;
import java.util.Scanner;

public class RollDie 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of trails");
		int trail = sc.nextInt();
		Random r = new Random();
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		int sixCount = 0;

		for (int i = 1; i <=trail; i++)
		{
			int val = r.nextInt(6)+1;
			if(val == 1){
				oneCount++;
			}
			else if (val == 2) {
				twoCount++;
			}else if (val == 3) {
				threeCount++;
			}else if (val == 4) {
				fourCount++;
			}else if (val == 5) {
				fiveCount++;
			}else if (val == 6) {
				sixCount++;
			}

			System.out.println("Trail "+i+" = "+val);
		}
		System.out.println("------------");
		System.out.println("Number of 1: "+oneCount);
		System.out.println("Number of 2: "+twoCount);
		System.out.println("Number of 3: "+threeCount);
		System.out.println("Number of 4: "+fourCount);
		System.out.println("Number of 5: "+fiveCount);
		System.out.println("Number of 6: "+sixCount);

				
	         
	}

}
