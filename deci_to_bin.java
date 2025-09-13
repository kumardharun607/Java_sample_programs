import java.util.*;
class  deci_to_bin
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your Decimal value:");
		int deci=sc.nextInt();
		String ans="";
		while(deci>0)
		{
			ans=deci%2+ans;
			deci=deci/2;
		}
		System.out.println("Binary value is:"+ans);
	}
}
