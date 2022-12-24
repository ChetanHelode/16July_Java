package Logical_Programs;

public class factorial_number {
	
	// factorial of 5
	public static void main(String [] args)
	{   int num = 5;
	
	    int factorial = 1;
	    
	    for (int i=1;i<=5;i++)
	    {   // 1<5 true    2<5 true  3<5 true    4<5 true   5=5 true
	    	//  1=1*1,1      1=1*2,2   2=2*3,6    6=6*4,24   24=24*5,120        
	    	
	    	factorial = factorial*i; 
	    }
		System.out.println("--------factorial of 5--------");
	    System.out.println(factorial);
	    System.out.println("-------factorial of 7---------");
	    m1();
	    System.out.println("--------factorial from 1-10 --------");
	    m2();
	    m4();
	
	}
	
	// factorial of 7
	public static void m1()
	{  int a = 5;
	
	   int fac = 1;
	   
	   for (int i=1;i<=a;i++)
	   {
		   fac=fac*i;
	   }
		System.out.println(fac);
	   }
	
	
	// factorial of 1-10
	public static void m2()
	{  int num1=10;
	   int fact=1;
	   for(int i=1;i<=num1;i++)
	   { fact=fact*i;
	     System.out.println(fact);
	   }
		
		
		
		
		
	}
	
	public static void m4()
	{
	  int a=5;
	  int fact=1;
	  
	  for (int i=1;i<=a;i++)
	  {
		  fact=fact*i;
				  
	  }
	  System.out.println("factorial of number "+a+" : "+fact);
	  
	  
	}
	
	

}
