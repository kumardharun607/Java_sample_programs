import java.util.*;
class  array_remove_duplicates
{
	public static void main(String[] args) 
	{
		int []a={8,4,8,3,7,2,4,1};
		System.out.println(Arrays.toString(a));
		int res[]=removedup(a);
		System.out.println(Arrays.toString(res));
	}
	public static int[] removedup(int []a)
	{
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]==Integer.MIN_VALUE)
			{
				continue;
			}
			for (int j=i+1;j<a.length ; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=Integer.MIN_VALUE;
				}
			}
			
		}
		int res[]=new int[a.length-count];
		for (int i=0,x=0;i< a.length;i++ )
		{
			if(a[i]!=Integer.MIN_VALUE)
			{
				res[x++]=a[i];
			}
			
		}
		return res;
}
}
