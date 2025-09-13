import java.util.*;
class numberprogram1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int even;
		System.out.println("Enter value of n:");
		int n=sc.nextInt();
		int sumeven=0;
		int sumodd=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				even=1;
				sumeven+=i;
				switch(even)
			{
				case 1->{
					System.out.print(i+" ");
				}
				case 2->{
					System.out.print(i+" ");
				}
			}
			}
			else if(i%2!=0)
			{
				even=2;
				sumodd+=i;
				switch(even)
			{
				case 1->{
					System.out.print(i+" ");
				}
				case 2->{
					System.out.print(i+" ");
				}
			}
			}
			
		}
			System.out.println("The Sum of Even is:"+sumeven);
			System.out.println("The Sum of odd is:"+sumodd);
			
		
		
	}
}
