class showroom 
{
	private String mgr,branch;
	private car_blueprint cars[];
	
	private showroom(String mgr,String branch,car_blueprint cars[])
	{
		this.mgr=mgr;
		this.branch=branch;
		this.cars=cars;
	}
	
	public car_blueprint[] get_car()
	{
		return cars;
	}
	
	public static showroom get_showroomobj(String mgr,String branch,car_blueprint cars[])
	{
		return new showroom(mgr,branch,cars);
	}
	
	public void details_showroom()
	{
		System.out.println("Showroom mgr:"+mgr);
		System.out.println("Showroom branch:"+branch);
		System.out.println("Showroom Total cars:"+cars.length);
	}

}
