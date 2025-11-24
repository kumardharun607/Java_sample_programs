import java.util.*;
class workerobjgen 
{

	static Scanner sc=new Scanner(System.in);
	static String details="";
	
	public static void main(String[] args) 
	{
		boolean flag=true;
		do
		{
			System.out.println("\t\t\t1.New Register \n\t\t\t2.View already Register \n\t\t\t3.Exit");
			System.out.print("Enter the Your option:");
			int opt=sc.nextInt();
			if (opt==1)
			{
				boolean flag1=true;
				do
				{
				
				System.out.print("Enter the name:");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println();
				System.out.print("Enter the Id:");
				int id=sc.nextInt();
				System.out.println();
				System.out.println("\t\t\t1.sumbit \n\t\t\t2.clear \n\t\t\t3.Exit");
				System.out.print("Enter the Your option:");
				int opt1=sc.nextInt();
				System.out.println();
				if (opt1==1)
				{
					worker w1=new worker(name,id);
				    w1.display();
				
				    details=details+" "+name;
					flag1=false;
				}
				if (opt1==3 )
				{ 
					flag1=false;
				}
				
				}
				while (flag1);
				
				
			}
			if (opt==2)
			{
				String [] detailsarr=details.split(" ");
				for (int i=0;i<detailsarr.length ; i++)
				{
				
				  System.out.println(detailsarr[i]);
				}
			}
			if (opt==3)
			{
				flag=false;
			}
		}
		while (flag);
	}
}
