package Array;

public class sample19 {
	
	// for-each loop 
	
	public static void main(String[] args) {
		
		String [] cars = {"Volvo","BMW","Ford","Mazda"};
		
		for (String i : cars)
		{
			System.out.println(i);
		}
		
		
		int [] numbers = {21,22,23,24,25,26,27,28,29,30};
		
		System.out.println(numbers.length);
		
		for (int j : numbers)
		{
			System.out.println(j);
		}
	}

}
