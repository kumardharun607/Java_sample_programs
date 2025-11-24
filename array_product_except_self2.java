import java.util.*;
class array_product_except_self2 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4};
		System.out.println(Arrays.toString(a));
		int res[]=productexceptself(a);
		System.out.println(Arrays.toString(res));
		
	}
	public static int[] productexceptself(int []a)
	{
		int n=a.length;
		
		int res[]=new int[n];
		
		for (int i=0;i<n ;i++ )
		{
			int product=1;
			for (int j=0;j<n ;j++ )
			{
				if(a[i]!=a[j])
				{
					product*=a[j];
				}
			}
			res[i]=product;
		}
		return res;
	}
		
		
}
