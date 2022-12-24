package Exception_handling;

public class example4 {
	
	public static void main(String[] args) {
		
		{
			// int [] ar = new int [4];
		    //	String s1 = "Space";
			int a = 10; int b = 0; int div = 0;
			
			try {
				// ar[1]=10;
				// System.out.println(s1.charAt(55));
				div = a/b;
				}
			catch(ArithmeticException ae)
			{
				System.out.println("Arithmetic Exception handled");
			}
			
			catch(StringIndexOutOfBoundsException ae)
			{
				System.out.println("String Index Out Of Bounds exception handled");
			}
			
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("Array Index Out Of Bounds Exception handled");
			}
			
			System.out.println("Hello");
			System.out.println("Hello world");
			System.out.println("Welcome");
			
			
			
			
			
			
			
			
		}
		
	}

}
