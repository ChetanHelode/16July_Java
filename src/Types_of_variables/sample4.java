package Types_of_variables;

public class sample4 {
	
	// global variable in static method

	int c = 60;   // global variable
	
	public static void mtd1()      // static method
	{   sample4 s1=new sample4();
		System.out.println(s1.c);
	}
	
	public static void main(String[] args)  // main method
	{
		
		mtd1();  

	}
	
}


