package Types_of_variables;

public class sample3 {

	
	//example of non-static global variable
	
		int c=50;  //non-static global variable 
		
		
		public static void main(String[] args) 
		{
			//non-static global variable call from same class 
			sample3 s3=new sample3();    //1. create object of same class
			System.out.println(s3.c);    //2. objectname.variableName
			
			System.out.println("-------");
			
			Sample1 s4=new Sample1();   //1. create object of diff class
			System.out.println(s4.d);     //2. diffClasObjectname.variableName
		
		}
		
		public static void m1() 
		{
			sample3 s4=new sample3();
			System.out.println(s4.c);		
		}
		
		public void m2() 
		{
			System.out.println(c);
		}

}
