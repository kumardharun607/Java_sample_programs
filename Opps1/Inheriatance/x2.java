//inheritance of static 
class x1
{
	static int x=10;
	static{
		System.out.println("Iam from x1 MLI");
	}
	public static void main()
	{
		System.out.println("Iam from x1 class main method");
	}
	
}
class x2 extends x1
{
	public static void main(String[]args)
	{
		System.out.println(x);
		main();
	}
	{
		System.out.println("Iam from x2 class MLI"+x);
	}

		
}
