package This_Super_Keywords;

public class demo4 {
	
	
int a=20;            //global variable
	
	public void m1() 
	{
		int a=30;     //local variable
		System.out.println(a);         //30
		System.out.println(this.a);     //20
	}

}
