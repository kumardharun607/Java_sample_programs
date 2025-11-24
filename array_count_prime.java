import java.util.*;
class  array_count_prime
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={6,2,3,5,7,11,8,9,10,13};
		System.out.println("The given array is a:"+Arrays.toString(a));
		count_prime(a);
		
	}
	public static int count_prime(int []b)
	{
		int count=0;
		int sum=0;
		String prime_numbers=""; 
		for(int i=0;i<b.length;i++)
		{
			if(check_prime(b[i]))
			{
				count+=1;
				sum+=b[i];
				prime_numbers+=b[i]+" ";
			}
		}
		System.out.println("The prime numbers present  in this array is:"+prime_numbers);
		System.out.println("The total  prime numbers in this array is:"+count);
		System.out.println("The sum of  prime numbers in this array is:"+sum);
		
		return count;
	}
	public static boolean check_prime(int n)
	{
		if(n==1 || n==0)
		{
			return false;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
