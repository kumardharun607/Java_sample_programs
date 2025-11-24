import java.util.*;
class Sim 
{
	private String brand_widh;
	private String operator_name;
	private double price;
	
	Sim(){}
	
	private Sim(String brand_widh,String operator_name,double price)
	{
		this.brand_widh=brand_widh;
		this.operator_name=operator_name;
		this.price=price;
	}
	
	public static Sim getsimobj(String brand_widh,String operator_name,double price)
	{
		return new Sim(brand_widh,operator_name,price);
	}
	
	public String getbrandwidh()
	{
		return brand_widh;
	}
	public String operator_name()
	{
		return operator_name;
	}
	public double price()
	{
		return price;
	}
}

class Mobile
{
	private String name;
	private String RAM;
	private String ROM;
	private double price;
	Sim slot;
	
	Mobile(String name,String RAM,String ROM,double price)
	{
		this.name=name;
		this.RAM=RAM;
		this.ROM=ROM;
		this.price=price;
	}
	public void details_of_mobile()
	{
		System.out.println("Name:"+name);
		System.out.println("RAM:"+RAM);
		System.out.println("ROM:"+ROM);
		System.out.println("price:"+price);
	}
	
	public void addsim(Sim sim)
	{
		if(slot==null)
		{
			slot=sim;
			System.out.println("\t\t\t"+slot.operator_name()+" Sim is added");
		}
		else
		{
			System.out.println("\t\t\tSlot is full");
		}
	}
	public void removesim()
	{
		if (slot==null)
		{
			System.out.println("\t\t\tSlot is already empty");
			
		}
		else
		{
			slot=null;
			System.out.println("\t\t\tSim is removed");
		}
	}
	public void checkslotisempty()
	{
		if (slot==null)
		{
			System.out.println("Slot is Empty");
		}
		else
		{
			System.out.println("Slot is full");
		}
	}
	public void details_of_sim()
	{
		if (slot==null)
		{
			System.out.println("Slot is Empty");
			
		}
		else
		{
			System.out.println("Band_widh"+slot.getbrandwidh());
			System.out.println("Operator_name"+slot.operator_name());
			System.out.println("Price"+slot.price());
		}
	}

	
		

	
	
	
}

class mobileobj
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Sim sim=Sim.getsimobj("5G","Airtel",500);
		Mobile mobile=new Mobile("Realmi","8GB","256GB",20000);
		boolean flag=true;
		do
		{
			System.out.println("_______-----------Welcome----------________");
			System.out.println("\t\t\t1.Mobile details \n\t\t\t2.Sim details \n\t\t\t3.Insert sim \n\t\t\t4.Remove sim \n\t\t\t5.Check slot \n\t\t\t6.Exit");
			int opt=sc.nextInt();
			switch (opt)
			{
			case 1->{
				mobile.details_of_mobile();
			
			}
			case 2->{
				mobile.details_of_sim();
			}
			case 3->{
				mobile.addsim(sim);
			}
			case 4->{
				mobile.removesim();
			}
			case 5->{
				mobile.checkslotisempty();
			}
			case 6->{
				flag=false;
			}
			}

			
		}
		while (flag);
	}
}
