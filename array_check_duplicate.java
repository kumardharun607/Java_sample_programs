import java.util.*;
class  array_check_duplicate
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={6,2,3,5,7,11,8,9,10,13,4,6,8,7,11};
		System.out.println("The given array is a:"+Arrays.toString(a));
		duplicate_value(a);
		
	}
	public static void duplicate_value(int []b)
	{
		
		System.out.print("The duplicated values: "); 
		for(int i=0;i<b.length;i++)
		{
			int count=0;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.print(b[i]+" ");
			}
		}
		
		
		
	}
	
}
