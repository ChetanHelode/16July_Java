package Logical_Programs;

public class swap_number {
	
	public static void main(String [] args)
	{
		int a = 70;
		int b = 50;
		int c;
		
		System.out.println(a+" "+b);
		c=b;
		b=a;
		a=c;
		System.out.println(a+" "+b);
		
		System.out.println();
		
		m1();
	}
	
	public static void m1()
	{
		int a=40;
		int b=50;
		int c;
		
		System.out.println(a+" "+b);
		
		c=b;
		b=a;
		a=c;
		
		System.out.println(a+" "+b);
	}
	
	

}
