import java.util.*;
class passengerobjgen 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		
		passenger[] car=new passenger[3];
		for (int i = 0; i < car.length; i++) {
        System.out.print("Enter the name for P" + (i + 1) + ": ");
        String name = sc.nextLine();

        System.out.print("Enter the Source for " + name + ": ");
        String source = sc.nextLine();

        System.out.print("Enter the Destination for " + name + ": ");
        String destination = sc.nextLine();

        System.out.print("Enter the Contact for " + name + ": ");
        long contact = sc.nextLong();
        sc.nextLine(); // consume newline

        car[i] = new passenger(name, source, destination, contact); 
        }
	    
		System.out.println("\t\t\t To print the address of 3 objects in a array");
		System.out.println();
		System.out.println("----------------------------------------------------");

//-----------------------------------------------------------------------------------------------------------------------------------------------
		  for (int i=0;i<car.length ;i++ )
		{
			System.out.println(car[i]);
			
			
			
			
		}
		System.out.println();
		System.out.println("----------------------------------------------------");

		


		
		
	    for (int i=0;i<car.length ;i++ )
		{
			System.out.println(" the name :"+car[i].getName());
			
			System.out.println(" the Source "+car[i].getSource());
			
			System.out.println("the Destination "+car[i].getDestination());
			
			System.out.println(" the Contact "+car[i].getContact());
			
			System.out.println();
			System.out.println("----------------------------------------------------");

			
			
			
		}
		
		System.out.println("Please enter a Reg mobile number for view details:");
		long user_cont=sc.nextLong();
		int index_obj=view_details(user_cont,car);
		if(index_obj!=-1)
		{
			System.out.println("Your record is found----------------");
			car[index_obj].details();
		}
		else
		{
			System.out.println("Sorry your record is not found----------------");
		}
		
		
		//----------------------------------------------------------------------------------------------------------------
		
		System.out.println("\t\t\tUpdating the destination Info");
		System.out.println("-----------Display the details who's destination as chennai");
		for (int i=0;i<car.length ;i++ )
		{
			if (car[i].getDestination().equalsIgnoreCase("cheNNaI"))
			{
				
				car[i].details();
				
			}
		}
		
		System.out.println("\n\n");
		System.out.println("----------Change the destination as salem on progress");
		Thread.sleep(2000);
		for (int i=0;i<car.length ;i++ )
		{
			if (car[i].getDestination().equalsIgnoreCase("cheNNaI"))
			{
				car[i].setdestination("Salem");
			}
		}
		System.out.println("\n\n");
		System.out.println("----------After updating the destination ");
		for (int i=0;i<car.length ;i++ )
		{
			 Thread.sleep(2000);
			System.out.println(" the name :"+car[i].getName());
			
			System.out.println(" the Source "+car[i].getSource());
			
			System.out.println("the Destination "+car[i].getDestination());
			
			System.out.println(" the Contact "+car[i].getContact());
			
			System.out.println();
			System.out.println("----------------------------------------------------");

			
			
			
		}

		

		
		
	}
	public static int view_details(long user_cont, passenger car[])
	{
			
		for (int i=0;i<car.length ;i++ )
		{
			if (car[i].getContact()==user_cont)
			{
				return i;
			}
			
				
			
		  }
		  return -1;
	}
			
			
			
			
		
	
	}

