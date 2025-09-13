import java.util.*;
class typechecker
{
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
	{
		System.out.print("Enter any character:");
		char a=sc.next().charAt(0);
		
		if((a>='a' && a<='z') || (a>='A'&& a<='Z'))
		{
			System.out.println("Letter");
			
		}
		else if(a>='0' && a<='9')
		{
			System.out.println("Integer");
		}
		else
		{
			System.out.println("Invalid");
		}
       
            
            
        
    }
}
