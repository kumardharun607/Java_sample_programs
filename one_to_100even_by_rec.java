class  one_to_100even_by_rec
{
	public static void main(String[] args) 
	{
		int data=1;
		rec(data);
	}
	public static void rec(int data)
	{
		if(data<=100)
		{
			if(data%2==0)
			{
				System.out.print(data+" ");
			}
			data++;
			rec(data);
		}
	}
}
