import java.util.*;
class array_first_and_last_occurance_target_element 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={8,7,6,3,7,9,8,8,8,3,4,0};
		System.out.println("The given array:"+Arrays.toString(a));
		System.out.print("Enter your target element:");
		int n=sc.nextInt();
		first_last(a,n);
	}
	public static void first_last(int a[],int n)
	{
			
		int first=-1;
		int last=-1;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]==n)
			{
				last=i;
			}
			if(first==-1)
			{
				first=i;
			}
		}
		System.out.println("First occurance:"+first);
		System.out.println("last occurance:"+last);
		
		
	}
}
