import java.util.*;
class array_mda1_getvalue_traverse
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("Enter the row size:");
		int row_size=sc.nextInt();
		System.out.print("Enter the column size:");
		int column_size=sc.nextInt();
		int [][]a=new int[row_size][column_size];
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print("Enter the value for a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("T2B L2R");
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("T2B R2L");
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=a[i].length-1;j>=0 ;j-- )
			{
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("B2T L2R");
		for (int i=a.length-1;i>=0 ;i-- )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("B2T R2L");
		for (int i=a.length-1;i>=0 ;i-- )
		{
			for (int j=a[i].length-1;j>=0 ;j--)
			{
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}
}
