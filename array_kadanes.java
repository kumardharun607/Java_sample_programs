import java.util.*;
class  array_kadanes
{
	public static void main(String[] args) 
	{
		int []a={2,-3,7,-4,6};
		System.out.println(Arrays.toString(a));
		int max_sum=Integer.MIN_VALUE;
		int cur_sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			cur_sum+=a[i];
			max_sum=Math.max(max_sum,cur_sum);
			if(cur_sum<0)
			{
				cur_sum=0;//in this kadanes approach asuume cur_sum<0 means cur_sum=0
			}
		}
		
			
		System.out.println("The largest of the sum of sub array elements:"+max_sum);
	}
}
