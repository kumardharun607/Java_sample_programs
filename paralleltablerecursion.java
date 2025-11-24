import java.util.*;
class paralleltablerecursion
{
	static Scanner sc=new Scanner(System.in);
	static int x;
	public static void main(String[] args) 
	{
		x=1;
		System.out.println("Enter a start number:");
		int strt=sc.nextInt();
		System.out.println("Enter a last number:");
		int lst=sc.nextInt();
		int temp=strt;
		tables(strt,lst,temp);
	}
	public static int tables(int start,int last,int temp)
	{
		
		if(x<=10)
		{
			if(start<=last)
			{
				System.out.print(start+"X"+x+"="+(start*x)+"\t");
				start++;
				tables(start,last,temp);
			}
			System.out.println();
			x++;
			tables(temp,last,temp);
			
			
			
		}
		return start ;
		
	}
			
}
