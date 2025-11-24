import java.util.*;
class Employee
{
	static Scanner sc=new Scanner(System.in);
	//states
	String name;
	String emailid;
	String DoB;
	private String user_name;
	private String password;
	private StringBuilder ID;
	Company updates=new Company();
	
	//constructors
	public Employee(String name,String emailid,String DoB,String user_name,String password,StringBuilder ID,Company updates)
	{
		this.name=name;
		this.emailid=emailid;
		this.DoB=DoB;
		this.user_name=user_name;
		this.password=password;
		this.ID=ID;
		this.updates=updates;
	}
	
	//Behaviours
	
	public void display()
	{
		System.out.println("Details_________________________");
		System.out.println("\n\n");
		System.out.println("Name:"+name);
		
		
		System.out.println("Email Id:"+emailid);
		System.out.println("DOB:"+DoB);
        System.out.println("\n\n");
		System.out.println("---------------------------");
		System.out.println("\n\n");
	}
	
	//helper method
	
	//getuser_name method
	
	public String getusername()
	{
		
			return user_name;
		
	}
	
	public String getpassword()
	{
		
			return password;
		
		
	}
	
	public StringBuilder getID()
	{
		
			return ID;
		
	}
	public void setID(StringBuilder ID)
	{
		this.ID=ID;
		System.out.println("Successfully ID updated......");
	}
	
	
	
	
	
	public String getuser_name()
	{
		
		return user_name;
	}
	
	//get password method
	
	public String getuser_password()
	{
		
			return password;
		
	}
	
	
	
	//set user_name method
	
	
	
	
	
	public void setusername()
	{
		System.out.print("Enter the New username:");
	   
		String new_username=sc.nextLine();
						
		
			user_name=new_username;
			
			
			System.out.println("-----------Successfully Username will be updated---------------");
		
			
		
		
		
	}
	
	//set password method
	
	public void setpassword()
	{
		System.out.print("Enter the New password:");
						
		String new_password=sc.nextLine();
						
		
			password=new_password;
			
			
			System.out.println("-----------Successfully password will be updated---------------");
		
		
	}
	
	


	
}
