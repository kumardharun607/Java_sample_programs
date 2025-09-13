import java.util.*;
class  countdigit
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int count=0;
		if(num==0)
		{
			count=1;
		}
		while(num>0)
		{
			count+=1;
			num=num/10;
		}
		System.out.println("Total digit is:"+count);
	}
}
