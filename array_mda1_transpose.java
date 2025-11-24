import java.util.*;
class array_mda1_transpose
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[][]={ {4,1,6},
			        {2,3,4},
			        {7,2,1} };
		
		//printing the given array a:
		
		System.out.println("The original array a:");
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		//transpose the array
		
		System.out.println("The After transposing array a:");
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[j][i]+" ");
				
				
			}
			System.out.println();
		}
		
		
		
	}
}
