import java.util.*;
class  factrec
{
	static Scanner sc=new Scanner (System.in);
	static int ans=1;
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("Enter start number: ");
		int number=sc.nextInt();
		System.out.println("Start.................");
		Thread.sleep(3000);
		int res=checkfact(number);
		System.out.println("The factorial of the given number is:"+res);
		Thread.sleep(3000);
		System.out.println("Ends.................");
		return;
		
		
			
		
	}
	public static int checkfact(int num)
	{
		
		if(num>=2)
		{
			ans=ans*num;
			num=num-1;
			checkfact(num);
		}
		
		return ans;
		
	}
		
	}
	
					
			
		
				
			
		
	
	

