package Types_of_variables;

public class sample7 {
	
	static String a = "Static global variable same class";   // Static global variable


	public static void main(String[] args)
       { 
		// same class
		System.out.println(a+" - 1");  // calling static variable directly into main method
		
		m1();    // calling static global variable from static regular method
		
		sample7 s1=new sample7(); // create an object
		s1.m2();                  // calling non-static global variable from static regular method
		
		
		// diff class
		
		System.out.println(sample8.a);
		
		
		
		
		
       } 

	public static void m1()
	    
	    {
		System.out.println(a+" - 2");
		System.out.println(sample8.a);
		}
	
	public void m2()
	
    	{
		System.out.println(a+" - 3");
		System.out.println(sample8.a);
	    }
			
}
