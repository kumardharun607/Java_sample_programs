import java.util.*;
class carobjgen {
  
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception
	{
        car c1 = new car();
        car c2 = new car();
        car c3 = new car();
		
		for (int i=0;i<c1.details.length ;i++ )
		{
			
		
		
		
		
			System.out.print(c1.demo[i]+":");
			c1.details[i]=sc.nextLine();
			System.out.println();
			
		
		}
		
		
		for (int i=0;i<c2.details.length ;i++ )
		{
			
		
		
		
		
			System.out.print(c2.demo[i]+":");
			c2.details[i]=sc.nextLine();
		    System.out.println();
	
		
		}
		
		
		for (int i=0;i<c3.details.length ;i++ )
		{
			
		
		
		
		
			System.out.print(c3.demo[i]+":");
			c3.details[i]=sc.nextLine();
			System.out.println();
		
		}
		Thread.sleep(2000);
		c1.details();
		Thread.sleep(2000);
		c2.details();
		Thread.sleep(2000);
        c3.details();

      
    }
}