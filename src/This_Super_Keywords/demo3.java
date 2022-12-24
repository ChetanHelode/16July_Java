package This_Super_Keywords;

public class demo3 {
	
	int a = 12;
	
	public void m1() 
	{
		int a=10;    //global variable from super class
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		
		demo3 s1=new demo3();
		s1.m1();
	}
	

}
