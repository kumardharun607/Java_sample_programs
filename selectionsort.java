import java.util.*;
class  selectionsort
{
	public static void main(String[] args) 
	{
		int []a={-5,14,98,-13,-3,15,0};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length-1;i++ )
		{
			int s=i;
			for (int j=i+1;j<a.length;j++ )
			{
				if(a[j]<a[s])
				{
					s=j;
				}
			}
				int temp=a[i];
					a[i]=a[s];
					a[s]=temp;
			
		}
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
	}
}
