import java.util.*;
class product_prime 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("n=");
		int n=sc.nextInt();
		int count =0;
		String s="";
		for (int i=2;i<=Integer.MAX_VALUE ;i++ )
		{
			if (checkprime(i))
			{
				s+=i+" ";
				count++;
					if (count==n)
					{
						System.out.println(s);
					     print_product(s);
						 return;
					}
			}
			
		}
	}
	public static boolean checkprime(int n)
	{
		if (n==0||n==1)
		{
			return false;
		}
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void print_product(String s)
	{
		String b1[]=s.split(" ");
		
		int b[]=new int[b1.length];
		for (int i=0;i<b1.length ;i++ )
		{
			b[i]=Integer.parseInt(b1[i]);
		}
		int product=1;
		System.out.print("Product:");
		for (int i=0;i<b.length ;i++ )
		{
			product*=b[i];
			if (i==0)
			{
				System.out.print(b[i]);
			}
			else
			{
				System.out.print(b[i]+"X");
			}
			
		}
		System.out.print("="+product);
	}
}
