import java.util.*;
class string5 
{
	public static void main(String[] args) 
	{
		String s="aaabbaaccd";
		char a[]=s.toCharArray();
		int count=1;
		for (int i=0;i<a.length-1 ;i++ )
		{
			if (a[i]!=a[i+1])
			{
				System.out.print(a[i]+""+count);
				count=0;
			}
			count++;
		}
		System.out.print(a[a.length-1]+""+count);
	
	}
}
