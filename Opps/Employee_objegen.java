import java.util.*;
class Employee_objegen 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		static Employee [] employees=new Employee[20];
		static String emails[]=new String[20];
		static String contacts[]=new String[20];
		static int count=0;
		static AlphaNumericOTP otp= new AlphaNumericOTP();
		static check_user_already_exist check_exist=new check_user_already_exist();
		
		boolean flag=true;
		boolean main_flag=true;
		do
	    {
			System.out.println("\t\t\t1.EMPLOYEE PORTAL\n\t\t\t2.ADMIN PORTAL \n\t\t\t3.Exit");
			int main_opt=sc.nextInt();
			switch(main_opt)
			{
				case 1->{
					do
					{
						System.out.println("-------------------------Employee Portal------------------------------");
			            System.out.println("\t\t\t1.Create new account \n\t\t\t2.Login \n\t\t\t3.Forget password \n\t\t\t4.Forget Username \n\t\t\t4.Foget ID \n\t\t\t5.Exit");
			            System.out.println("----------------------------------------------------------------------");
			            System.out.println();
			
			            System.out.print("Enter your option:");
			            int opt1=sc.nextInt();
			            switch(opt1)
			            {
			            case 1->
			            {
							StringBuilder new_ID =create_account();
							dashborad(new_ID);
				        
				           
						
				  	
				
			}
			case 2->{
				//login
			}
			case 3->{
				//forget password
			}
			case 4->{
				//forget username
			}
			case 5->{
				//forget id
			}
			default->{
				flag=false;   //Main exit
			}
			
		

			}
		
		}
		while (flag);
		}
		case 2->{
			//admin panel
		}
		default->{
			main_flag-false;
		}
			
		}
		}while (main_flag);
		
	
	}
	public static StringBuilder create_account()
	{ 
		
		System.out.println("-------------Welcome----------");
		                System.out.print("Enter name of the user:");
				        sc.nextLine();
		                String name=sc.nextLine();
		                System.out.println();
		                System.out.print("Enter Emailid of the user:");
		                String emailid=sc.nextLine();
				        System.out.print("Enter Your Mobile number:");
				
		                long contact=sc.nextLong();
		                System.out.println();
				        String user_contact=contact+"";
				        int temp=count;
				        emails[temp]=emailid;
				        contacts[temp]=contact;
				        count=count+1;
				
				        //Check user is already exist
				
				        if (check_exist.check_email_already_exist(emailid,emails)&& check_exist.check_contact_already_exist(user_contact,contacts))
				        {
							int temp=count;
				            emails[temp]=emailid;
				            contacts[temp]=contact;
				            
							System.out.println();
		                    System.out.print("Enter DOB of the user:");
		                    String DoB=sc.nextLine();
		                    System.out.println();
		                    System.out.print("Enter Username of the user:");
		                    String username=sc.nextLine();
		                    System.out.println();
		                    System.out.print("Enter Password of the user:");
		                    String password=sc.nextLine();
		                    System.out.println();
				            StringBuilder ID=otp.otpgenerator();
			
				           
				            
							employees[count] = new Employee(name,emailid,DoB,username,password,ID);
							System.out.println("This is your ID:"+employees[count].getID());
							count=count+1;
							
						}
						return ID;
	}
	public static void dashborad(StringBuilder ID)
	{
		if(ID_verification(ID))
		{
		boolean flag1=true;
		for (int i=0;i<emails.length ;i++ )
		{
			if (emails[i].getID().equals(ID))
			{
				Employee employee_obj_address=emails[i];
			}
		}
				           do
		                   {
							   System.out.println("____________________Dashboard____________________");
					           System.out.println("\t\t\t1.View Your Details \n\t\t\t32.View Company updates \nt\t\t3.Change Id \n\t\t\t4.Change Username \n\t\t\t5.Change password \n\t\t\t6.Exit");
					           System.out.print("Enter your option:");
					
			                   int opt2=sc.nextInt();
					           switch (opt2)
					           {
								   case 1->{
									   view_profile(employee_obj_address);
					               }
					               case 2->{
									   
									   Company_updates(employee_obj_address);
						          
					               }
					               case 3->{
									  
									   change_ID( employee_obj_address);
					               }
					              case 4->{
						
						
						          change_username(employee_obj_address);
					              }
					              case 5->{
						
						
						          change_password(employee_obj_address);
					              }
					              default->{
						          flag1=false;
					              }
						
					
					           }
				  
				
		                  }while (flag1);
	}
	else{
		System.out.println("Login Failed..............");
		System.out.println("Try after create account");
		create_account();
	}
		
	
   }
   public static boolean ID_verification(StringBuilder ID)
	{
	   for (int i=0;i<emails.length ; i++)
	   {
		   if (emails[i].getID().equals(ID))
		   {
			   return true;
		   }
	   }
	   return false;
	}
	public static void view_profile(Employee employee_obj_address)
	{
		employee_obj_address.display();
	}
	public static void Company_updates(Employee employee_obj_address)
	{
		employee_obj_address.updates.getupdates();
	}
	public static boolean change_ID_verification(Employee employee_obj_address)
	{
		System.out.print("Enter the Username:");
		String user_username=sc.nextLine();
		System.out.print("Enter the password:");
		String user_pswrd=sc.nextLine();
		if (employee_obj_address.getuser_name().equalsIgnoreCase(user_username)&&employee_obj_address.getuser_password().equalsIgnoreCase(user_pswrd))
		{
			return true;
		}
		return false;
	}
	public static void change_ID(Employee employee_obj_address)
	{
		 if (change_ID_verification(employee_obj_address))
									   {
										   ID=otp.otpgenerator();
										   System.out.print("This is your ID:"+ID);
										   employee_obj_address.setID(ID);
									   
									   }
	}
	public static void change_username(Employee employee_obj_address)
	{
		System.out.print("Enter the ID:");
		StringBuilder user_id=sc.nextLine();
		if (ID_verification(user_id)
		{
			employee_obj_address.setusername();
		}
		else
		{
			System.out.println("Verification failsed.....");
		}
	}
	public static void change_password(Employee employee_obj_address)
	{
		System.out.print("Enter the ID:");
		StringBuilder user_id=sc.nextLine();
		if (ID_verification(user_id)
		{
			employee_obj_address.setpassword();
		}
		else
		{
			System.out.println("Verification failsed.....");
		}
	}
		
		
}
		
	


class check_user_already_exist
{
		public  boolean check_email_already_exist(String emailid,String emails[])
		{
			for (int i=0;i<emails.length ;i++ )
			{
				if (!(emails[i].equalsIgnoreCase(emailid)))
				{
					return true;
				}
				
			}
			System.out.println("Sorry you already registered");
			return false;
		
		}
		public  boolean check_contact_already_exist(String contact,String contacts[])
		{
			for (int i=0;i<emails.length ;i++ )
			{
				if (!(emails[i].equalsIgnoreCase(emailid)))
				{
					return true;
				}
			}
			System.out.println("Sorry you already registered");
			return false;
		
		}
		
}
