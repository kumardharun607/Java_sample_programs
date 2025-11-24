import java.util.*;
class  fibonacci
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		fibbo(num);

	}
	public static void fibbo(int n)
	{
		int n1=0;
		int n2=1;
		int n3=0;
		for(int j=1;j<=n;j++)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			
			System.out.print(n3+" ");
			
			
		}
				
			
		
	}
	
}
