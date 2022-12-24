package This_Super_Keywords;

public class demo2 extends demo1 {
	 int a = 3;
	public void mul()
	{   int a = 4;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	
	public static void main(String[] args) {
		
		demo1 s1=new demo1();
		s1.add();
		
		demo2 s2=new demo2();
		s2.mul();
	}

}
