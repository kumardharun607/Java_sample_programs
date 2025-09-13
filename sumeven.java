import java.util.*;
class sumeven
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int sum=0;
		System.out.print("Enter starting number:");
		int start=sc.nextInt();
		System.out.print("Enter ending number:");
		int end=sc.nextInt();
		while(start<=end)
		{
			if(start%2==0)
			{
				sum+=start;
			}
			start++;
		}
		System.out.println("Total even:"+sum);
		
	}
}
