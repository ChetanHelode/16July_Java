package Exception_handling;

public class example1 {

	public static void main(String[] args) {
		
		int [] ar = new int [4];    // 0 1 2 3
		
		
		try 
		{
			ar[5]=10;    // risky code
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bounds Exception handled");
        }
		
		System.out.println("Hiiiiiii");
		System.out.println("Hello");
		
		
	}
}
