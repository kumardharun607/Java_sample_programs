import java.util.*;
class array_mda1_assignment
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [][] a={ {10,20,30,40,50},//shift n=3
			        {2,4,2,7,3,6,7},//remove dup
			        {1,2,5,7,11},     //missing num
		            {8,3,4,6},       //reverse
		            {1,0,0,1,1,0},   //shift 0&1
			        {8,14,3,-2,4,16},//1st largest & smallest
			        {2,4,5,6,7,11}};//only print prime
		
		//printing the given array a:
		
		System.out.println("The original array a:");
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		System.out.println("*******************************");
		System.out.print("Enter the n value for shift:");
		int n=sc.nextInt();
		int top=0;
		
		for (int j=1;j<=n ;j++ )
		{
			int first=a[top][top];
			for (int i=1;i<a[top].length ;i++ )
			{
				a[top][i-1]=a[top][i];
				System.out.print(a[top][i-1]+" ");
			}
			a[top][a[top].length-1]=first;
			System.out.print(a[top][a[top].length-1]);
			System.out.println();
		}
		System.out.println("*******************************");
		System.out.println("Remove duplicate elements in 2nd array");
		top++;
		Arrays.sort(a[top]);
		int count=0;
		for (int i=0;i<a[top].length-1 ;i++ )
		{
			if (a[top][i]==a[top][i+1])
			{
				a[top][i]=Integer.MIN_VALUE;
				count++;
			}
		}
		int []b=new int [a[top].length-count];
		for (int i=0,x=0;i<a[top].length ;i++ )
		{
			if (a[top][i]!=Integer.MIN_VALUE)
			{
				b[x++]=a[top][i];
			}
		}
		a[top]=b;
		for (int i=0;i<a[top].length ;i++ )
		{
			System.out.print(a[top][i]+" ");
		}
		System.out.println();
		System.out.println("*******************************");
		System.out.println("Print the missing elements in 3rd array");
		top++;
		
		for (int i=0,m=1;i<a[top].length ;i++,m++ )
		{
			if(a[top][i]!=m)
			{
				System.out.print(m+" ");
				i--;
			}
		}
		System.out.println();
		System.out.println("*******************************");
		System.out.println("Reverse  elements in 4th array");
		top++;
		int l=0;
		int r=a[top].length-1;
		while(l<r)
		{
			int temp=a[top][l];
			a[top][l]=a[top][r];
			a[top][r]=temp;
			l++;
			r--;
		}
		for (int i=0;i<a[top].length ;i++ )
		{
			System.out.print(a[top][i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("*******************************");
		System.out.println("Shift 0's and 1's in 5th array");
		top++;
		l=0;
		r=a[top].length-1;
		while(l<r)
		{
			if (a[top][l]==0 && a[top][r]==1)
			{
				int temp=a[top][l];
			    a[top][l]=a[top][r];
			    a[top][r]=temp;
			    l++;
			    r--;
	
		    }
		    else if (a[top][l]==1)
		    {
				l++;
		    }
		    else
		    {
				r--;
		    }
		}
		for (int i=0;i<a[top].length ;i++ )
		{
			System.out.print(a[top][i]+" ");
		}
		System.out.println();
		System.out.println("*******************************");
		System.out.println("Find the 1st largest and smallest element in 6th array");
		top++;
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<a[top].length ;i++ )
		{
			if (a[top][i]>largest)
			{
				largest=a[top][i];
			}
		}
		int smallest=largest;
		for (int i=0;i<a[top].length ;i++ )
		{
			if (a[top][i]<=smallest)
			{
				smallest=a[top][i];
			}
		}
		System.out.println("Largest value in 6th array is:"+largest);
		System.out.println("smallest value in 6th array is:"+smallest);
		System.out.println();
		System.out.println("*******************************");
		System.out.println("Find the prime number element in 7th array");
		top++;
		for (int i=0;i<a[top].length ;i++ )
		{
			if (checkprime(a[top][i]))
			{
				System.out.print(a[top][i]+" ");
			}
		}
	}
		public static boolean checkprime(int n)
		{
			if (n==0 || n==1)
			{
				return false;
			}
			else
			{
				for (int i=2;i<n ;i++ )
				{
					if (n%i==0)
					{
						return false;
					}
				}
			}
			return true;
		}

	
}
