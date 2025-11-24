import java.util.*;
class  array_reverse_2ndarray_merge
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={6,3,7,9,8};
		int[]b={8,8,3,4,0};
		System.out.println("The given array is a:"+Arrays.toString(a));
		System.out.println("The given array is b:"+Arrays.toString(b));
		int []res=reverse_array(a,b);
		System.out.println("The reverse of the 2nd array and merge array is res:"+Arrays.toString(res));
	}
	public static int[] reverse_array(int []a,int[]b)
	{
		int []rev=new int[a.length+b.length];
		for(int i=0,x=0,y=b.length-1;i<rev.length;i++)
		{
			if(x<a.length)
			{
				rev[i]=a[x++];
			}
			else if(y>=0)
			{
				rev[i]=b[y--];
			}
			
		}
		
		
		return rev ;
	}
	
}
