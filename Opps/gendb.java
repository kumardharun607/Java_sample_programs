class gendb 
{
	public static void main(String[] args) throws Exception
	{
		Database1 db1=Database1.gendb("Sql");
		Thread.sleep(200);
		System.out.println(db1);
		Database1 db2=Database1.gendb("Sql");
		Thread.sleep(200);
		System.out.println(db2);
		Database1 db3=Database1.gendb("Sql");
		Thread.sleep(200);
		System.out.println(db3);
	}
}
