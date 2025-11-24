class employee 
{
	//states
	String ename;
	int eid;
	double esalary;
	static String company="TCS";
	
	public employee(String name,int id,double salary)
	{
		//L.I
		ename=name;
		eid=id;
		esalary=salary;
	}
	public void detailsOfEmp()
	{
		System.out.println("Name:"+ename);
		System.out.println("Id:"+eid);
		System.out.println("Salary:"+esalary);
		System.out.println("Company:"+company);
	}
}

