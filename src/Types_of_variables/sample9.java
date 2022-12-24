package Types_of_variables;

public class sample9 {
	
	String a = "Non-static global variable";
	
	public static void main(String [] args)
	{   
		sample9 s1=new sample9();
		System.out.println(s1.a);
		
		m1();
		
		s1.m2();
	}

	
	public static void m1()
	{
		sample9 s1=new sample9();
		System.out.println(s1.a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
}
