import java.util.*;
class Egen 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("-------------------Create object by default constructor and to give value by each and every variable can get and give it---------------------");
		E e1=new E();
		e1.name="Dharun";
		e1.id=123;
		e1.phone_no=321;
		e1.detailsofemp();
		System.out.println("-------------------Create object by created constructor and to give value by using to give formal arugements as constructor already having variable---------------------");
		System.out.print("Enter the name:");
		String name=sc.nextLine();
		System.out.print("Enter the id:");
		int id=sc.nextInt();
		System.out.print("Enter the phone number:");
		long phone_no=sc.nextLong();
		E e2=new E(name,id,phone_no);
		
		e2.detailsofemp();
		System.out.println("-------------------Create object by default constructor and to give value by arguments as directly---------------------");
	    E e3=new E("rokesh",987,789);
		
		e3.detailsofemp();
	}
}
