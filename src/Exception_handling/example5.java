package Exception_handling;

public class example5 {
	
	public static void main(String[] args) {
		
		
		int [] ar = new int [4];
		try 
		{
					ar[1]=10;
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
		  System.out.println("Exception handled");
		}
		
		
		
		System.out.println("God is great");
		System.out.println("I am indian");
	}

}
