class Ball 
{
	 double radius;
	
	Ball(){}
	Ball(double radius)
	{
		this.radius=radius;
	}
	
	public double getradius()
	{
		return radius;
	}
	public void letsgame()
	{
		
	}
	
}
class tennis extends Ball

{
	String game="tenisball";
	
	public tennis()
	{
		
	}
	public tennis(double radius){
		super(radius);
	}
	
	public void letsgame()
	{
		System.out.println("Let's play"+game+"which has a radius is "+radius);
	}

}
class basketball extends Ball

{
	String game="Basketball";
	
	public basketball()
	{
		
	}
	public basketball(double radius){
		super(radius);
	}
	
	public void letsgame()
	{
		System.out.println("Let's play"+game+"which has a radius is "+radius);
	}

}

