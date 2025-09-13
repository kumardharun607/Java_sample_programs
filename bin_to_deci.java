import java.util.*;
class  bin_to_deci
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a Binary Value:");
		int bin=sc.nextInt();
		
		int x=1;
		int sum=0;
		
		while(bin>0)
		{
			sum=bin%10*x;
			bin=bin/10;
			x*=2;
		}
		System.out.println("Decimal value is:"+sum);
	}
}
