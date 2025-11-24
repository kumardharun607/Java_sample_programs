class y1 
{
	/*static{
		System.out.println("hi iam y1 MLI:"+y1.y);
	}*/
	int y=100;
	public static void main(/*String[]args*/)
	{
		System.out.println("Hi iam y1 Main method");
	}
	/*{
		System.out.println("hi iam y1 non satic MLI:");//to acees static member directly
		
	}*/
	
}
class y2 extends y1
{
	public void y2non()
	{
		System.out.println("hi iam y2 non satic method:"+y);
	}
		
	/*{
		System.out.println("hi iam y2 non satic MLI:"+y);//to acees static member directly
		
	}*/
	
	public static void main(String[]args)
	{
		y2 ref=new y2();
		/*y2 ref1=new y2();
		
		ref.main();*/
				ref.y2non();

	}
		
		
	
}
