import java.util.*;
class  Add_only_integer_in_array
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		char a[]={'D','3','H','9','A','8','R','3','U','0','N'};
		
		System.out.println("Array A:"+Arrays.toString(a));
		
		int sum=0;
			for (int j=0;j<a.length ;j++ )
			{
				if (a[j]>='0' && a[j]<='9')
				{
					sum+=a[j]-48;
				}
				
				
			}
			
		
		System.out.println("The sum of all elements in the array is "+sum);
		



	}
}
