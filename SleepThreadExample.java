import java.util.*;
class SleepThreadExample {
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)throws Exception
		{
        System.out.println("Enter Your DOB (Format:DD-MM-YYYY) :");
		String dob=sc.nextLine();
        System.out.println(dob.length());
        for (int i = 0; i < dob.length(); i++) {
			
            System.out.println(i);
			System.out.println(dob.charAt(i));
			// print character without new line
			Thread.sleep(100);
            
            
        }
		System.out.println(2025-2003);
    }
}
