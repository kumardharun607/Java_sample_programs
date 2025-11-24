//single level inheritance
//static members
/*class  A
{
	
	static{
		System.out.println("Iam a A class multi line initializer="+A.x);
	}
	static int x=10;
	A()
	{
	}
	public static void a()
	{
		System.out.println("Iam a A class method");
	}
		
}
class B extends A
{
	static int x=20;
	B()
	{ 
		super();
		//L.I
	}
	public static void main(String[]args)
	{
		System.out.println("X:"+x);
		B.a();
		System.out.println("X:"+x);
	}

		
}
class C extends A
{
	static int z=20;
	C()
	{ 
		super();
		//L.I
	}
	public static void main(String[]args)
	{
		System.out.println("X:"+C.x);
		C.a();
		System.out.println("z:"+C.z);
	}

		
}*/
class  A
{
	
	static{
		System.out.println("Iam a A class multi line initializer=");
	}

	A()
	{
	}
	public static void a()
	{
		System.out.println("Iam a A class method");
	}
		
}
class B extends A
{
	static int x=20;
	B()
	{ 
		super();
		//L.I
	}
	public static void main(String[]args)
	{
		
	}

		
}
class C 
{
	static int z=20;
	C()
	{ 
		super();
		//L.I
	}
	public static void main(String[]args)
	{
		System.out.println("X:"+B.x);
		
		System.out.println("z:"+C.z);
	}

		
}
