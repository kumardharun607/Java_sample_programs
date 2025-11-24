import java.util.*;
class  xylem
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter start number: ");
		int number=sc.nextInt();
		
		if(checkxylem(number))
		{
			System.out.print("The given number is Xylem");
		}
		else
		{
			System.out.print("The given number is not a Xylem");
		}
			
		
	}
	public static boolean checkxylem(int num)
	{
		int last=num%10;
		int start=num;
		int total=0;
		while(start>=10)
		{
			start=start/10;
		}
		int sum=last+start;
		for(int i=num;i>0;i=i/10)
		{
			total=total+i%10;
		}
		int res=total-sum;
		if(sum==res)
		{
			return true;
		}
		else
		{
			return false;
		}
		
				
			
		
	}
	
}
