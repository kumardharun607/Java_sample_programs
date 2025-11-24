import java.util.*;
class  evenOroddMethod
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(evenorodd(num));
		
	}
	public static String evenorodd(int num)
	{
		
		   
			if(num%2==0)
			{
				return "Even";
				
			}
			else
		    {
				return "Odd";
			}
			
	}
				
		
		
    
}
