import java.util.*;
class  array_add_even_elements
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the array:");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value for a["+i+"]:");
			a[i]=sc.nextInt();
			if(a[i]%2!=0)
			{
				do
				{
					System.out.println("Enter only even value for a["+i+"]:");
			        a[i]=sc.nextInt();
				}
				while (a[i]%2!=0);
			}
			
		}
		
		System.out.println("The given array is a:"+Arrays.toString(a));
		
		
	}
	
	
}
