package Types_of_variables;

public class sample14{

	
	String a = "Birds";
	String b = "Parrot";
	String c = "Peacock";
	
	public static void m1()
	{   sample14 s1= new sample14();
		System.out.println(s1.a+" "+s1.b+" "+s1.c);
	}
	
	public static void main(String[] args) {
		sample14 s1 = new sample14();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.c);
		m1();
	}
}
