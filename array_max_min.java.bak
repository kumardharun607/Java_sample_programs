import java.util.*;
class array_max_min
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		System.out.println("Enter a variable name:");
		int size =sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value for a["+i+"]:");
		    int value=sc.nextInt();
			a[i]=value;
		}
		
		System.out.println(Arrays.toString(a));
		for(int j=0;j<a.length;j++)
		{
			int value=0;
			int count=0;
			int sum=0;
			value=a[j];
			for(int k=0;k<a.length;k++)
			{
				if(value>=a[k])
				{
					count=count+1;
				}
				if(count==a.length)
				{
					System.out.println(value +"is greater");
				}
			}
			for(int m=0;m<a.length;m++)
			{
				if(value<=a[m])
				{
					sum=sum+1;
				}
				if(sum==a.length)
				{
					System.out.println(value +"is smaller");
				}
			}
		}
					
		}
		
	
	
}

