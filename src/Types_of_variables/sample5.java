package Types_of_variables;

public class sample5 {

	
	int c = 45;
	
	public void m2()
	{
		System.out.println(c);
	}
	
	public static void m3()
	{
		sample5 s3=new sample5();
		System.out.println(s3.c);
	}
	public static void main(String[] args) {
		
		sample5 s1 = new sample5();
		s1.m2();
		
		m3();
	
	}
	
	
}
