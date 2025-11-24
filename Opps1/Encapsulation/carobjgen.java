class Engine 
{
	String cc="600cc";
	private String power="300hp";
	private int stroke=4;
	private String type="Disel";
	
	Engine()
	{}
	
	public void detail_of_engine()
	{
		System.out.println("CC:"+cc);
		System.out.println("Power:"+power);
		System.out.println("Stroke:"+stroke);
		System.out.println("Type:"+type);
		System.out.println("CC:"+cc);
	}
				
	

}
class Car 
{
	private String name;
	private String color;
	private double price;
	Engine e=new Engine();
	
	Car(){}
	
	Car(String name,String color,double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
	}


}

class showroom 
{
	private String name;
	private String mgr;
	private String branch;
	private Car cars[];
	
	showroom(String name,String mgr,String branch,Car cars[])
	{
		this.cars=cars;
		this.name=name;
		this.mgr=mgr;
		this.branch=branch;
	}
	public Car[] getcars()
	{
		return cars;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("MGR:"+mgr);

		System.out.println("Branch:"+branch);
	}

	
}
class carobjgen
{
	public static void main(String[]args)throws Exception
	{
		//if car can be created then automatically created engine object with same value;
		
		Car c1=new Car("thaar","Black",120000);
		Car c2=new Car("BMW","White",130000);
		Car c3=new Car("Audi","Red",150000);
		Car cars[]={c1,c2,c3};
		cars[0].e.cc="800cc";
		
		showroom shop=new showroom("Kia","Selva","Tiruppur",cars);
		System.out.println("------------------ShowRoom Details------------------");
		shop.display();
		
		
		System.out.println("------------------Car Details------------------");
		for (int i=0;i<cars.length ;i++ )
		{
			cars[i].display();
			cars[i].e.detail_of_engine();
			Thread.sleep(200);
			
		}
		//change the first car engine cc
		
	}

}
