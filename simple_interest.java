import java.util.*;
class simple_interest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the principle Amount:");
		double principle=sc.nextDouble();
		
		System.out.print("Enter the Rate of interest (in percentage):");
		double rate=sc.nextDouble();

		System.out.print("Enter the Time --Total Duration-- (in years):");
		double time=sc.nextDouble();                      
		
		//Simple Interest=(principle*rate*time)/100
		
		//SI=(P*R*T)/100
		
		double SI =(principle*rate*time)/100; 
		System.out.println("The total Simple interest Amount (per year):"+(SI/time));

		System.out.println("The total Simple interest Amount (in 2 year):"+SI);

	}
}
