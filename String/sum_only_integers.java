import java.util.*;
class sum_only_integers 
{
	public static void main(String[] args) 
	{
		String s="ab12abc34c";
		int sum=0;
		char a[]=s.toCharArray();
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>='0' && a[i]<='9')
			{
				sum+=a[i]-48;
			}
		}
		System.out.println("The sum of integer is :"+sum);
	}
}
