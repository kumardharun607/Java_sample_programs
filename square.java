import java.util.*;
class recursion1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		print(num);
	}
	print(int n)
	{
		if(n>=1)
		{
			System.out.println("Hello world");
			n--;
			print(n);
		}
	}
			
}
