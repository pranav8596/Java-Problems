package programs;
import java.io.*; 
public class HarmonicNumber 
{
	static double nthHarmonic(int N) 
	{ 
		float harmonic = 1; 
		for (int i = 2; i <= N; i++) 
		{ 
			harmonic = harmonic + (float)1 / i; 
		} 

		return harmonic; 

	} 		
	public static void main (String[] args) { 
		int N = 5; 
		System.out.print(nthHarmonic(N)); 

	} 



}

