import java.util.*;
class  bubblesort
{
	public static void main(String[] args) 
	{
		int []a={-5,14,98,-13,-3,15,0};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length-1;i++ )
		{
			for (int j=0;j<a.length-1;j++ )
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
	}
}
