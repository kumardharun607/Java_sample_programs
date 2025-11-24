import java.util.*;
class string10 
{
	public static void main(String[] args) 
	{
		String s="Hi iam from chennai";
		String s1[]=s.split(" ");
		char a[]={'a','b'};
		System.out.println(Arrays.toString(s1));
		System.out.println(String.join("_",s1));
		String s2=new String(a);
		System.out.println(s2);
		System.out.println("Hello World!");
	}
}
