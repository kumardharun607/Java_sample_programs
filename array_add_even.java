import java.util.*;
class  array_add_even
{
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		System.out.println("a:"+Arrays.toString(a));
		int res=sumeven(a);
		System.out.println("The sum of even number is:"+res);
		
	}
	public static int sumeven(int []x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				sum=sum+x[i];
			}
		}
		return sum;
	}
}
