package programs;

import java.util.Scanner;

public class powerof2 {

	public static void powerOfTwo(int n) {
		int power = 1;
		for (int i = 0; i <= n ; i++) {
			System.out.println("2^"+i+" = "+power);
			power = power * 2;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		powerOfTwo(n);
	}
}

