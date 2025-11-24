import java.util.*;
class array_mda1_spiral
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [][] a={ {1,2,3,4,5},
			        {16,17,18,19,6},
			        {15,24,25,20,7},
		            {14,23,22,21,8},
		            {13,12,11,10,9}};
		
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
		
		int n=a.length-1;
		int top=0;
		int left=0;
		int right=n;
		int bottom=n;
		
		while(left<=right && top<=bottom)
		{
			
		
		for (int i=left;i<=right ;i++ )
		{
			
			
				System.out.print(a[top][i]+" ");
			
		}
		top++;
		
		for (int i=top;i<=bottom;i++)
		{
			System.out.print(a[i][right]+" ");
		}
		
		right--;
		
		for (int i=right;i>=left ;i-- )
		{
			System.out.print(a[bottom][i]+" ");
		}
		bottom--;
		
		for (int i=bottom;i>=top ;i-- )
		{
			System.out.print(a[i][left]+" ");
		}
		left++;
		
		}
		
	}
}
