package programs;
import java.util.Scanner;
import java.util.Random;

public class flipcoin {
	public static void flipCoin(int flips) {
		double head=0;
		 double tail=0;
		 double r=0;
		 double h=0;
		 double t=0;
		 
		 for(int i=0; i<flips; i++)
		 {
			r=Math.random();
			if(r<0.5) 
			{
				head++;
			}
			else 
			{
				tail++;
			}
		 }
			
	       System.out.println("No of head="+head);
	       System.out.println("No of tails="+tail);
	       h=(head/flips)*100;
	       t=(tail/flips)*100;

	       System.out.println("percentage of head="+h);
	       System.out.println("percentage of tail="+t);
	       System.out.println();
	}
	
 public static void main(String args []){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the terms you wants to flip;");
	 int flips = sc.nextInt();
	 flipCoin(flips);
	 
	      
 }
}
