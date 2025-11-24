import java.util.Scanner;
class Dudeney_number 

{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int ans=perfect(n);
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		if(ans==sum)
		{
			System.out.println("The given number is perfect cube or Dudeney  number");
		}
		else
		{
			System.out.println("The given number is not a perfect cube or Dudeney number");
		}
	}
	public static int perfect(int n)
	{
		int a=0;
		for (int i=0;i<=n;i++ )
		{
			if(i*i*i==n)
			{
				return i;
			}
		}
		a=Integer.MIN_VALUE;
		return a;
	}
}

