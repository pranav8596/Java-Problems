package ArrayPrograms;

import java.util.Scanner;

public class EvenNumber 
{
	public static void evenAndSum(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i%2 == 0) {
				System.out.print(i+" ");
				sum = sum + i;
			}
		}
		System.out.println();
		System.out.println("Sum: "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		evenAndSum(num);
	}

}
