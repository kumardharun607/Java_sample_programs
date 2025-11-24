class A2 
{
	String name="Dharunkumar";
	int a=12;
	A2()
	{
	}
	A2(int a)
	{
		this();
		this.a=a;+9
	}
	A2(double b,int a)
	{
		this(a);
		name="Rokesh";
	}
		
}
class B1 extends A2
{
	int id=123;
	B1(double a,int b)
	{
		super(a,b);
	}
	public static void main(String[]args)
	{
		B1 ref=new B1(5.3,7);
		System.out.println(ref.a);
		System.out.println(ref.name);
		System.out.println(ref.id);
	}

		
}
