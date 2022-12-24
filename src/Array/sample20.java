package Array;

import java.util.Arrays;

public class sample20 {
	public static void main(String[] args) {
		
	
	int [] numbers= {22,21,28,23,27,24,25,26};
	
	System.out.println("------Length-----------");
	System.out.println(numbers.length);
	
	System.out.println("------------for loop--------------");
	for (int i=0;i<=numbers.length-1; i++)
	{
		System.out.println(numbers[i]);
	}
	
    Arrays.sort(numbers);
    
	System.out.println("-----------for-each loop--------------");
	for (int j : numbers)
	{
		System.out.println(j);
	}
		
}
}
