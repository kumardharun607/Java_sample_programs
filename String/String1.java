
class String1 
{
	public static void main(String[] args) 
	{
		String s="sy23e4d";
		String ans="";
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			char c=s.charAt(i);
			if (c>='0' && c<='9')
			{
				ans=ans+c;
			}
		}
		System.out.println("Integer Reverse:"+ans);
	}
}
