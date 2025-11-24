import java.util.*;
class descentingsort_string 
{
	public static void main(String[] args) 
	{
		String s="beDAafNzMc";
		char a[]=s.toCharArray();
		char b[]=new char[a.length];
		Arrays.sort(a);
		
		int u=0;
		int lr=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (Character.isLowerCase(a[i]))
			{
				lr=i;
				break;
			}
		}
		for (int i=0;i<s.length() ;i++ )
		{
			if (Character.isLowerCase(s.charAt(i)))
			{
				b[i]=a[lr++];
			}
			else if (Character.isUpperCase(s.charAt(i)))
			{
				b[i]=a[u++];
			}
		}
		String s1=new String(b);
		
		System.out.println("String s:"+s);
				System.out.println("String s1:"+s1);

	}
}
