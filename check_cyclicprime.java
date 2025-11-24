public class check_cyclicprime {
    public static void main(String[] args) {
		
        String text = "1193";
		
		
		if(check_cyclicprogram(text))
		{
			System.out.print("cyclic prime");
		}
		else
		{
			System.out.print("not a cyclic prime");
			
		}
		
    }
	public static boolean check_cyclicprogram(String text)
	{
				for (int i=0;i<text.length() ;i++ )
				{
					int n=Integer.parseInt(text);
					if (!(check_prime(n)))
					{
						return false;
					}
					else
					{
						text=text.substring(1)+text.charAt(0);
					}
						
				}
				return true;
	}
	public static boolean check_prime(int n)
	{
		if (n==0 ||n==1)
		{
			return false;
		}
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
