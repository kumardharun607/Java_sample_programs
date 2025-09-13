import java.util.*;
class  facultys
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag=true;
		do
		{
		System.out.println("\t\t1.SQL\n\t\t2.Java\n\t\t3.Exit");
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1 ->{
				System.out.println("SQL by nagaraj");
			}
			case 2 ->{
				System.out.println("Java by tabrez");
			}
			case 3 ->{
				
				flag=false;
			}
			default ->{
				System.out.println("Invalid");
			}
		}
		}while(flag);
		System.out.println("--------Thank you--------");
			
	}
}
