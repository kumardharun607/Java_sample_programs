import java.util.*;
class string4 
{
	public static void main(String[] args) 
	{
		String s="Ta23rl12z";
		char a[]=s.toCharArray();
		int l=0;
		int r=a.length-1;
		while (l<r)
		{
			if (Character.isLetter(a[l]) && Character.isLetter(a[r]))
			{
				char temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			else if (Character.isDigit(a[l]))
			{
				l++;
			}
			else if (Character.isDigit(a[r]))
			{
				r--;
			}
		}
		System.out.println(new String(a));
	}
}
