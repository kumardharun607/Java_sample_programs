import java.util.*;
class passenger                                                                             

/* states
secured name,source,destination,contact
Common name as country*/





{
	static Scanner sc=new Scanner(System.in);
	//states
	private String name,source,destination;
	private long contact;
	
	static String country ="India";
	
	//constructors
	
	public passenger(String name,String source,String destination,long contact)
	{
		this.name=name;
		this.source=source;
		this.destination=destination;
		this.contact=contact;
		
	}
		
	
	//behaviours
	
	public String getName()
	{
		return name;
	}
	public String getSource()
	{
		return source;
	}
	public String getDestination()
	{
		return destination;
	}
	public long getContact()
	{
		return contact;
	}
	
	//set method for set destination
	
	public void setdestination(String destination)
	{
		if(do_verification())
		{
			this.destination=destination;
			System.out.println("---------Successfully destination will be updated----------");
		}
		else
		{
			System.out.println("---------Destination updates tends to be failed----------");
		}
	}
	
	//verification method
	
	public boolean do_verification()
	{
		System.out.println("\t\t\tVerification progress for:"+name);
		System.out.print("Enter your reg mobile number:");
		long user_contact=sc.nextLong();
		
		if(contact==user_contact)
		{
			int otp=(int)(Math.random()*9999+9999);
			System.out.println("OTP for "+name+":"+otp);
			int user_otp=sc.nextInt();
			
			if (otp==user_otp)
			{
				
				return true;
			}
		}
			
			return false;
		
	}
	
	public void details()
	{
		System.out.println("Name:"+name);
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Contact:"+contact);
		System.out.println("Country:"+country);
		

	}

}
