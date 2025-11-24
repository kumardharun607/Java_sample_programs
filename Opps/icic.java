class Bank 
{
	double balance=1;
	public void checkbal()
	{
		System.out.println("Checking balance......"+balance);
	}
	public void interest()
	{
		System.out.println("Rate of interest 0%......");
	}
}
class icic extends Bank
{
	double balance=10;
	public void interest()
	{
		System.out.println("Rate of interest 0.5%......");
	}
	public static void main(String[]args)
	{
		Bank ref=new icic();
		ref.checkbal();
		ref.interest();
	}
	
}
class sbi extends Bank
{
	double balance=20;
	public void interest()
	{
		System.out.println("Rate of interest 0.8%......");
	}
	public static void main(String[]args)
	{
		Bank ref=new sbi();
		ref.checkbal();
		ref.interest();
	}
	
}
	
