class worker 
{
	//states
	String name;
	int id;
	
	//constructors
	public worker(String ename,int eid)
	{
		name=ename;
		id=eid;
	}
	
	//behaviours
	public void display()
	{
		System.out.println("___________________Successfully Registered___________________");
		System.out.println("name:"+name);
		System.out.println("Id:"+id);
	}
}
