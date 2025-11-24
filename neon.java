import java.util.*;
class  neon
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter start number: ");
		int number=sc.nextInt();
		
		if(checkneon(number))
		{
			System.out.print("The given number is Neon");
		}
		else
		{
			System.out.print("The given number is not a Neon");
		}
			
		
	}
	public static boolean checkneon(int num)
	{
		int sum=0;
		int square=num*num;
		while(square>0)
		{
				
				sum+=square%10;
				square=square/10;
		}
		if(num==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
					
			
		
				
			
		
	}
	

