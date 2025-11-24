class string_assignment3 
{
	public static void main(String[] args) 
	{
		String s="aaabbaac";
		String res=solve(s);
		System.out.println(res);
	}
	public static String solve(String s)
	{
		char[] a=s.toCharArray();
		String res="";
		int count=1;
		for (int i=0;i<a.length-1 ;i++ )
		{
			if (a[i]!=a[i+1])
			{
				res=res+a[i]+count;
				count=1;
			}
			else
			{
				count++;
			}
		}
		res=res+a[a.length-1]+count;
		return res;
	}
}
