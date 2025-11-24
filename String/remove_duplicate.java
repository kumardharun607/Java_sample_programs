import java.util.*;
class remove_duplicate 
{
	public static void main(String[] args) 
	{
		String s="banana";
		String ans=remove_dup(s);
		System.out.println("The duplicate removed string:"+ans);
	}
	public static String remove_dup(String s)
	{
		String ans="";
		for (int i=0;i<s.length() ;i++ )
		{
			char c=s.charAt(i);
			if (ans.indexOf(c)==-1)
			{
				ans+=c;
			}
		}
		return ans;
	}
}
