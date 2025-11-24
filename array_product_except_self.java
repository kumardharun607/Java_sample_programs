import java.util.*;
class array_product_except_self1 
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
		int pref[]=new int[n];
		int suf[]=new int[n];
		int res[]=new int[n];
		pref[0]=1;
		suf[n-1]=1;
		for (int i=1;i<n ;i++ )
		{
			pref[i]=pref[i-1]*a[i-1];//fill prefix array
		}
		for (int i=n-2;i>=0 ;i-- )
		{
			suf[i]=suf[i+1]*a[i+1];//fill sufix array
		}
		for (int i=n-2;i>=0 ;i-- )
		{
			suf[i]=suf[i+1]*a[i+1];//fill sufix array
		}
		for (int i=0;i<n ;i++ )
		{
			res[i]=pref[i]*suf[i];//fill resultant array
		}
		return res;
	}
		
		
}
