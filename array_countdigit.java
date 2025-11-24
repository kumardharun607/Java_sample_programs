import java.util.*;
class  array_countdigit
{
	static Scanner sc=new Scanner(System.in);
	public static int countdigit(int []a,int n) 
	{
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args)
	{
		int []a={6,3,7,9,8,8,8,3,4,0};
		System.out.println(Arrays.toString(a));
		System.out.print("Enter value for count the digit:");
		int n=sc.nextInt();
		
		System.out.println("The count of the given digit is:"+countdigit(a,n));
	}
		
	
}
