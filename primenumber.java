import java.util.*;
class  primenumber
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(prime(num))
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		
	}
	public static boolean prime(int num)
	{
		if(num==0||num==1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
}
