import java.util.*;
class  guess_no_game
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int sys_guess=(int)(Math.random()*100);
		boolean flag=true;
		do
		{
			System.out.println("\t\t\t***********GUESS NUMBER*************");
			System.out.print("\t\t\tEnter Your Guess:");
			int user_guess=sc.nextInt();
			if(sys_guess>user_guess)
			{
				System.out.println("\t\t\tLow");
			}
			else if(sys_guess<user_guess)
			{
				System.out.println("\t\t\tHigh");
			}
			else
			{
				System.out.println("\t\t\t*********Congrats you found it************");
				System.out.print("\t\t\tFurther you want to continue(y/n):");
				char choice=sc.next().charAt(0);
				System.out.println("Processing---------------");
				Thread.sleep(3000);
				
			
				if(choice=='y')
				{
					sys_guess=(int)(Math.random()*100);
				}
				else
				{
					flag=false;
				}
			}
				
		}
		while (flag);
		System.out.println("\n\n\n\t\t\t------Thanks for Playing-----------");
	}
}
