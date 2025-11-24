class pattern4 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=0;i<n ;i++ )//rows
		{
			for (int j=0;j<n ;j++ )//coloumns
			{
				  //top left to bottom right
				  //------downwardown  ----forward up                 /*j==i-1 ||j==i-2 || j==i+1||j==i+3      ||*/
				if (i+j==2||j==i+2||j==i-2||i+j==6 )
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
