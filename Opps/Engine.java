class Engine 
{
	String cc;
	String power;
	int stroke;
	String type;
	
	Engine(String cc,String power,int stroke,String type)
	{ 
		this.cc=cc;
		this.power=power;
		this.stroke=stroke;
		this.type=type;
	}
	
	public void details_of_Engine()
	{
		System.out.println("Engine cc is:"+cc);
		System.out.println("Engine power is:"+power);
		System.out.println("Engine stroke is:"+stroke);
		System.out.println("Engine type is:"+type);
	}

}
