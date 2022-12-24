package Exception_handling;

public class example3 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		int division = 0;
		
		try 
		{
			division = a/b;
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Arithmetic exception handled");
		}
		
		System.out.println(division);
		System.out.println("Completed");
		
		
	}

}
