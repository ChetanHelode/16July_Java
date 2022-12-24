package Logical_Programs;

public class Prime_Number {
	
	public static void main(String [] args)
	{  int a=7;  // number for checking as prime number 
	   int flag=0;  
	 
	   for (int i=2;i<=a-1;i++)  // i=2 because every number is divisible by1, so we took i=2
	   {  if(a%i==0)  //  check if remainder is equal to zero
		     {flag=1;} // take this value if condition is true
	   }
	   
	   if(flag==0)  // check if value is equal to 0
	   {System.out.println("Its a prime number : "+a);}  // if true print this statement
	  
	   else
	   {System.out.println("Its not a prime number : "+a);}   // if false print this statement

	}
}
