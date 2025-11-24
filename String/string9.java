import java.util.*;
class string9 
{
	public static void main(String[] args) 
	{
		String s[]={"flower","flow","flight"};
		Arrays.sort(s);
		
		System.out.println(solve(s));
	}
	public static String solve(String s[])
	{
		String ans="";
		String s1=s[0];
		String s2=s[s.length-1];
		for (int i=0;i<s1.length() && i<s2.length() ; i++)
		{
			char a=s1.charAt(i);
			char b=s2.charAt(i);
			if (a!=b)
			{
				return ans;
			}
			else
			{
				ans+=a;
			}
		}
		return ans;
	}
		
}
