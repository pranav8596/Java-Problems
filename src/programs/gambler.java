package programs;



import java.util.Scanner;

public class gambler {
	public static void main(String[]args)
	{
		int stake, goal,trial, win=0,bet=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your stake:");
		stake=scan.nextInt();
		
		System.out.println("Enter your goal:");
		goal=scan.nextInt();
		
		System.out.println("Enter your trial:");
		trial=scan.nextInt();
		
		int cash=stake;
		for(int i=0;i<trial;i++)
		{
			while(cash>0 && cash<goal)
			{
				bet++;
				if (Math.random() < 0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
				
			}
			
		}
		if(cash==goal)
		{
			win++;
			System.out.println("Won");
		}else {
			System.out.println("Lose");
		}
		
		System.out.println(win+" wins of "+trial);
		System.out.println("Percentage of trial is:" + 100*win/trial);
		System.out.println("bet: "+bet);
		System.out.println("average of bet is:"+ 1.0*bet/trial);
		
	}

}
