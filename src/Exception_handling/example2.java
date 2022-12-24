package Exception_handling;

public class example2 {
	
	public static void main(String[] args) {
		
		String s1 = "abcd";   // 0 1 2 3
		
		try
		{
			System.out.println(s1.charAt(6));
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Hello");
		System.out.println("Group 3");
	}

}
