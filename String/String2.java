import java.util.*;
class String2 
{
	public static void main(String[] args) 
	{
		String s="AbcBRd83k$#8";
		char a[]=s.toCharArray();
		int up_c=0;
		int lw_c=0;
		int di_c=0;
		int sp_c=0;
		for (int i=0;i<a.length ;i++ )
		{
		
		if (Character.isUpperCase(a[i]))
		{
			up_c++;
		}
		else if (Character.isLowerCase(a[i]))
		{
			lw_c++;
		}
		else if (Character.isDigit(a[i]))
		{
			di_c++;
		}
		else if (!(Character.isUpperCase(a[i])) && !(Character.isLowerCase(a[i])) && !(Character.isDigit(a[i])))
		{
			sp_c++;
		}
		}
		
		System.out.println("Total uppercase:"+up_c+"\n"+"Total lowerercase:"+lw_c+"\n"+"Total digit:"+di_c+"\n"+"Total specialcase:"+sp_c);
		

	}
}
