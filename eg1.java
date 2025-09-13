
import java.util.*;
class Remote
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("1.Power ON \n2.Power OFF \n3.Volume UP \n4.Volume Down");
		System.out.print("Enter Your Option:");
		int opt=sc.nextInt();
		
		if(opt==1)
		{
			System.out.println("Power ON successfully");
		}
		else if(opt==2)
		{
			System.out.println("Power OFF successfully");
		}
		else if(opt==3)
		{
			System.out.println("Volume up successfully");
		}
		else if(opt==4)
		{
			System.out.println("Volume DOWN successfully");
		}
		else
		{
			System.out.println("Invalid option");
		}
	}
}
