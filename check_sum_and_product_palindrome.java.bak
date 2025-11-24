import java.util.*;
class  check_sum_and_product_palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print("Enter valur for a["+i+"]:");
			a[i]=sc.nextInt();
		}
			
			for (int i=0;i<a.length-1 ;i++ )
			{
				for (int j=i+1;j<a.length ;j++ )
				{
					long sum=0;
					long product=1;
					sum=a[i]+a[j];
					product=a[i]*a[j];
					if (check_palindrome(sum) && check_palindrome(product))
					{
						System.out.println("Pair:("+a[i]+","+a[j]+")");
						System.out.println("Sum:"+sum+"(palindrome)");
						System.out.println("Product:"+product);
						System.out.println("Reverse:"+product);
						System.out.println("SPECIAL");
						
					}
				}
			}
		
	}
	public static boolean check_palindrome(long n)
	{
		String s=n+"";
		String rev="";
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			rev+=s.charAt(i);
		}
		return rev.equals(s);
	}
}
