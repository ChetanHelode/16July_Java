package Types_of_variables;

public class Sample1 {

	
	//example of local & global variable
	
	
		int c=50;    //global variable
		
		public void m1()
		{
			int a=10;                //local variable
			System.out.println(a);      //10
			System.out.println(c);      //50
		}
			
		public void m2()
		{
			int b=20;                  //local variable
			System.out.println(b);    //20
			System.out.println(c);    //50
		}
		
		static int b=20;     //static global variable from diff class

		int d=60;   //non-static global variable from diff class
}
