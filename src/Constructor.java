

public class Constructor {

	int a = 1;
	
	public void m1()
	{   int a = 14;
		System.out.println(a);
		System.out.println(this.a);
		
		
		
	}
	public static void main(String[] args) {
		
		Constructor s1=new Constructor();
		s1.m1();
		
	}
	
	
}
