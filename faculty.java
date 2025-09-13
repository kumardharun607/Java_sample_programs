import java.util.*;
class faculty
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\n\t\t\t1.SQL \n\t\t\t2.JAVA ");
		System.out.print("\n----------SELECT YOUR SUBJECT----------:");
		int sub=sc.nextInt();
		
		
		switch(sub)
		{
			case 1:
			{
				System.out.println("\n\t\t\t1.Nagaraj \n\t\t\t2.Vinod ");
				System.out.print("\n----------SELECT YOUR FACULTY-----------:");
				int faculty=sc.nextInt();
				
				switch(faculty)
				{
					case 1:
					{
						String str1="SQL by Nagaraj-------------------------";
						System.out.println("\n");
						for(int i=0;i<str1.length();i++)
						{
							
							System.out.print(str1.charAt(i));
							Thread.sleep(100);
							
						}
						break;
						
					}
					case 2:
					{
						String str2="SQL by Vinod-------------------------";
						System.out.println("\n");
						for(int i=0;i<str2.length();i++)
						{
							System.out.print(str2.charAt(i));
							Thread.sleep(100);
							
						}
						break;
					}
					default:
					{
						System.out.println("\n*****No Trainer*****");
						break;
					}
					
				}
				break;
			}
			case 2:
			{
				System.out.println("\n\t\t\t1.Tabrez \n\t\t\t2.Pranav ");
				System.out.print("\n----------SELECT YOUR FACULTY----------:");
				int faculty2=sc.nextInt();
				
				switch(faculty2)
				{
					case 1:
					{
						String str3="JAVA by Tabrez-------------------------";
						System.out.println("\n");
						for(int i=0;i<str3.length();i++)
						{
							System.out.print(str3.charAt(i));
							Thread.sleep(100);
							
						}
						break;
						
					}
					case 2:
					{
						String str4="JAVA by Pranav-------------------------";
						System.out.println("\n");
						for(int i=0;i<str4.length();i++)
						{
							System.out.print(str4.charAt(i));
							Thread.sleep(100);
							
						}
						break;
					}
					default:
					{
						System.out.println("\n*****No Trainer*****");
						break;
					}
						
					
				}
				break;
			}
			default:
			{
				System.out.println("\n*****No Subject*****");
			}
				
			}
		
	}
}
