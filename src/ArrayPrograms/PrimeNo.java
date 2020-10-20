package ArrayPrograms;


public class PrimeNo {
	
	public static void prime(int num) {
		int sum = 0;
		for (int i = 2; i <= num; i++) {
			int isPrime = 1;
			for (int j = 2; j < i; j++) {
				if (i%j == 0 ) {
					isPrime = 0;
				}
			}
			if (isPrime == 1) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("Sum: "+sum);
	}

	public static void main(String[] args) {
		prime(50);
	}

}
