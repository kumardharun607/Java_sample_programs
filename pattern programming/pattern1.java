class pattern1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=13;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==i-1||j==i-4|| j==i-12 ||j==i+1||j==i+4|| j==i+12 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("@ ");
				}
			}
			System.out.println();
		}
	}
}
