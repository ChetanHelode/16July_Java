
public class sample2 {

	public static void main(String[] args)                //main method
	{
		int marks=210;                               
		if(marks>=200) {System.out.println("Pass");}      //If else control statement
		else   {System.out.println("Fail");}
		
		mtd1();                                         //static regular method from same class --> zero parameter
		
		sample2 s2=new sample2();                       //non_static regular method from same class -- > zero parameter
		s2.mtd2();                                    
		
        sample3.mtd3(533, 596);                         //static regular method from same class --> parameter
	    
	    sample3 s3=new sample3();                       //non_static regular method from diff class --> parameter
	    s3.mtd4(976, 599);
			
		
	}
	
	public static void mtd1()                             //static regular method
	{  int x=20;
	   int y=30;
	   System.out.println("\nThis is Static regular method from same class :- "+"Sum = "+(x+y));  }
	
	public void mtd2()
	{System.out.println("\nThis is Static regular method from same class");    //non-static regular method
		
	}	
}
