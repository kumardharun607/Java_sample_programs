import java.util.*;
class compound_interest 
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
		
		//Compound Interest=
		//(principle*((1+rate)/100)^time)-principle
		
		//CI=(P*1+R/100^T)-P
		
		double CI =(principle*(Math.pow(1+rate/100,time)))-principle; 
		
		System.out.println("The total Compound interest Amount (in 2 year):"+CI);

	}
}
