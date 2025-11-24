import java.util.*;
public class Ballgen {
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        Bag b = new Bag();
		boolean flag=true;
		do
		{
			System.out.println("\t\t\t1.Add Ball \n\t\t\t2.Check bag contain which ball \n\t\t\t3.Check bag is empty \n\t\t\t4.RemoveBall \n\t\t\t5.Let's play \n\t\t\t6.Exit");
			int n=sc.nextInt();
			
			switch (n)
			{
			case 1->{
				boolean flag1=true;
				do
				{
				
				System.out.println("\t\t\t1.Basket ball \n\t\t\t2.Tennis Ball \n\t\t\t3.Exit");
				int n1=sc.nextInt();
				switch (n1)
				{
				case 1->{
					basketball basket=new basketball(7.5);
					b.addball(basket);
				
				}
				case 2->{
					tennis tennisball=new tennis(5.0);
					b.addball(tennisball);
				}
				default ->{
					flag1=false;
				}
				}
				}
				while (flag1);
			
			}
			case 2->{
				b.checkbag();
			}
			case 3->{
				System.out.println(b.bagisempty());
			}
			case 4->{
				b.removeball();
			}
			case 5->{
				b.play(b.bag);
			}
			default ->{
				boolean falg=false;
			}
			
				
				
		}
		}
		while (flag);

        /*b.addball(new tennis(3.5));
        b.checkbag();
        b.play(b.bag);

        b.removeball();

        b.addball(new basketball(7.2));
        b.checkbag();
        b.play(b.bag);*/
    }
	
}
