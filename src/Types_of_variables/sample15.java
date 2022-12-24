package Types_of_variables;

public class sample15 {
	
	String a = "Fruits";
	String b = "Mango";
	String c = "Watermelon";
	
	public void m2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
			
	public static void main(String[] args) {
		sample15 s1=new sample15();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.c);
		
		System.out.println("\n");
		
		sample15 s2 = new sample15();
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s2.c);
	}
	

}
