import java.util.*;
class string3 
{
	public static void main(String[] args) 
	{
		String s="SPideR";
		
		char a[]=s.toCharArray();
		
		for (int i=0;i<a.length ;i++ )
		{
			if (Character.isUpperCase(a[i]))
			{
				a[i]+=32;
				
			}
			else if (Character.isLowerCase(a[i]))
			{
				a[i]-=32;
				
			}
			
		}
		System.out.println(new String(a));
	}
}
