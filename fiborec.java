import java.util.*;
class  fiborec
{
	static Scanner sc=new Scanner (System.in);
	static int series=1;
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("Enter number series: ");
		series=sc.nextInt();
		System.out.println("Start.................");
		Thread.sleep(3000);
		checkfibo(0,1,0);
		
		Thread.sleep(3000);
		System.out.println("Ends.................");
		return;
		
		
			
		
	}
	public static void checkfibo(int n1,int n2,int n3)
	{
		
		if(series>=1)
		{
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			n3=n1+n2;
			
			series--;
			checkfibo(n1,n2,n3);
		}
		
		return;
		
	}
		
	}
	
					
			
		
				
			
		
	
	

