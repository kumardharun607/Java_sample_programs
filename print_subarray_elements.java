import java.util.*;
class  array_print_subarray_elements
{
	public static void main(String[] args) 
	{
		int []a={2,3,7,4,6};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				System.out.print("(");
				for (int k=i;k<=j ;k++ )
				{
					System.out.print(a[k]+" ");
				}
				System.out.print(")");
				System.out.print("\t");
			}
			System.out.println();
			
		}
	}
}
