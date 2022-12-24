package Array;

public class sample23 {
	
	public static void main(String[] args) {
		
		// Exaample 2. to check if value is present in integer
		
		int [] marks = {21,22,23,24,25,26,27,28,29,30};
		int num = 21;
		for (int elements : marks) 
		{
		if (num==elements)
		{
			System.out.println("Value is present in integers");
			break;
		}
		else
		System.out.println("Value is not present in integers");	
		}
	}

}
