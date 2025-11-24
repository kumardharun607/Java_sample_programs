import java.util.*;
class  array_reverse_even
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={16,2234,3,57762,7,11,868,9,1016,13};
		System.out.println("The given array is a:"+Arrays.toString(a));
		int [] res=check_even(a);
		System.out.println("After reversing of even number the array is a:"+Arrays.toString(res));
		
	}
	public static int[] check_even(int []b)
	{
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				b[i]=reverse_even(b[i]);
					
				
			}
		}
		
		
		return b;
	}
	public static int reverse_even(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	
    }
}
