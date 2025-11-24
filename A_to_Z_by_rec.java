class  A_to_Z_by_rec
{
	public static void main(String[] args) 
	{
		char data='A';
		rec(data);
	}
	public static void rec(char data)
	{
		if(data<='Z')
		{
			System.out.print(data+" ");
			data++;
			rec(data);
		}
	}
}
