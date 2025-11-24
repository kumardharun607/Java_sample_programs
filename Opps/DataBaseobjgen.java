class DataBaseobjgen 
{
	public static void main(String[] args) 
	{
		DataBase db1=DataBase.getdataBase("101","Dinga");
		DataBase db2=DataBase.getdataBase("102","Manga");
		DataBase db3=DataBase.getdataBase("103","Mangi");
		
		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
		
		System.out.println(db3.db_name);

	}
}
