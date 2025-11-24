import java.util.*;
class  happy
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter start number: ");
		int number=sc.nextInt();
		
		if(checkhappy(number))
		{
			System.out.print("The given number is happy");
		}
		else
		{
			System.out.print("The given number is unhappy");
		}
			
		
	}
	public static boolean checkhappy(int num)
	{
		int sum=0;
		if(num==1 || num==4)
		{
			if(num==1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			
			while(num>0)
			{
				
				sum+=num%10*num%10;
				num=num/10;
				
			}
		}
		num=sum;
		return checkhappy(num);
	}
	
					
			
		
				
			
		
	}
	

