import java.util.*;
class  ishappy
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
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
		
		while(num!=1 && num!=4)
		{
			int sum=0;
			while(num>0)
			{
				
				sum+=num%10*num%10;
				num=num/10;
				
			}
			num=sum;
		}
		return num==1;
	}
	
					
			
		
				
			
		
	}
	

