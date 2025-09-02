class tables 
{
	public static void main(String[] args) throws Exception
	{
		int a=2;
		int i=1;
		System.out.println("______________Tables_____________________");
		
		System.out.println("Processing------------");
		Thread.sleep(3000);
		
		for(i=1;i<=10;i++)
		{
			Thread.sleep(1000);
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
	}
}
