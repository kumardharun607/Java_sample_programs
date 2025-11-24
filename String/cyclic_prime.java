class cyclic_prime 
{
	public static void main(String[] args) 
	{
		String s="1193";
		if (check_cyclic(s))
		{
			System.out.println("Yes cyclic");
		}
		else
		{
			System.out.println("Not a cyclic");
		}
	}
	public static boolean check_cyclic(String s)
	{
		for (int i=1;i<=s.length() ;i++ )
		{
			int n=Integer.parseInt(s);
			if (check_prime(n))
			{
				s=s.substring(1)+s.charAt(0);
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static boolean check_prime(int n)
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
		
}
