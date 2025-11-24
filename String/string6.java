class string6 
{
	public static void main(String[] args) 
	{
		String s="a13b12c3d1";
		char a[]=s.toCharArray();
		char ch='a';
		String digit="";
		for (int i=0;i<a.length ;i++ )
		{
			if (Character.isLetter(a[i]))
			{
				ch=a[i];
				digit="";
			}
			else if (Character.isDigit(a[i]) )
			{
				digit+=a[i];
			
			if (i==a.length-1||Character.isLetter(a[i+1]))
			{
				
				int n=Integer.parseInt(digit);
				for (int j=1;j<=n ;j++ )
				{
					System.out.print(ch);
				}
				System.out.println();
				
				
			}
			}
			
		}
		
	}
}
