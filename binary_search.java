import java.util.*;
class  binary_search
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int []a={10,20,30,40,50,60,70};
		System.out.println("the array:"+Arrays.toString(a));
		System.out.print("Enter the element you want to search:");
		int n=sc.nextInt();
		if(bisearch(a,n))
		{
			System.out.println("The element is found");
		}
		else
		{
			System.out.println("The element is not found");
		}
	}
	public static boolean bisearch(int []a,int n)
	{
		int l=0;
		int h=a.length-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==n)
			{
				return true;
			}
			else if(a[m]>n)
			{
				h=m-1;
			}
			else
			{
				l=m+1;
			}
		}
		return false;
	}
}
