package programs;


public class coupanNumber {


	public static void main(String[] args) 
	{
		String s ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		char chars[] = s.toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		System.out.println(random);
		StringBuffer sb=new StringBuffer();
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random = random/chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}
}