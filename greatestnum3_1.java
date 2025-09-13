import java.util.*;
class greatestnum3_1 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)throws Exception
	{
		System.out.print("Enter a number1:");
		int a=sc.nextInt();
		System.out.print("Enter a number2:");
		int b=sc.nextInt();
		System.out.print("Enter a number3:");
		int c=sc.nextInt();
		
		String res=(a>b) && (a>c) ? "a is greater":(b>a) && (b>c) ? "b is greater":"c is greater";
		System.out.println(res);
	}
}
