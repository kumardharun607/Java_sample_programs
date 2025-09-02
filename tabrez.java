class tabrez 
{
	public static void main(String[] args) throws Exception
	{
		double wallet=10000;
		Thread.sleep(3000);
		System.out.println("Available Bank Balance---------------:"+wallet);
		double shoe_price=2000;
		Thread.sleep(3000);
		System.out.println("A Single Pair of Shoe Price is---------------:"+shoe_price);
		Thread.sleep(3000);
		System.out.println("A Three Pair of Shoe Price Is---------------:"+(shoe_price*3));
		Thread.sleep(3000);
		System.out.println("Tabrez Broughted Three Pair Of Shoes---------------");
        wallet=wallet-shoe_price*3;
		Thread.sleep(3000);
		System.out.println("Available Bank Balance---------------:"+wallet);
		
	}
}
