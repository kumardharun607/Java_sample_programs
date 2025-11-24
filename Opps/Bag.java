class Bag 
{
	
	Ball ball;
	
	Bag(){}
	public Bag(Ball ball)
	{
		this.ball=ball;
	}
	
	//check bag contains which ball
	public void checkbag()
	{
		if (ball instanceof tennis)
		{
			System.out.println("Bag contains Tennis ball");
		}
		else if (ball instanceof basketball)
		{
			System.out.println("Bag contains Basket ball");
		}
		else
		{
			System.out.println("Bag is empty");
		}
	}
	//add ball
	public void addball(Ball ball)
	{
		if (ball!=null)
		{
			System.out.println("Sorry Bag is already filled");
		}
		else
		{
			this.ball=ball;//upcasting child class obj ref to paren class ref
			System.out.println("Ball is added");
		}
	}
	//remove ball
	public void removeball()
	{
		if (bag==null)
		{
			System.out.println("Already bag is empty");
		}
		else
		{
			bag=null;
			System.out.println("Ball is removed");
		}
	}
	//check bag is empty
	public boolean bagisempty()
	{
		return ball==null;
	}
	//play
	public void play(Ball balls)
	{
		if (balls instanceof tennis)
		{
			balls.letsgame();
		}
		else if (balls instanceof basketball)
		{
			balls.letsgame();
		}
		else
		{
			System.out.println("Bag is empty");
		}
	}
}
