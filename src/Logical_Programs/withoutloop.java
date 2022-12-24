package Logical_Programs;

public class withoutloop {
	
	public static void main(String[] args) {
		
	m1();
		
	}
	
	public static void m1()//int a)
	{   int a = 1;
		if(a<=10)
		{	System.out.println(a);
		m1();
		}
		}
}
