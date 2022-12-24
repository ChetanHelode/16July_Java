package Array;

import java.util.Arrays;

public class sample14 {
	public static void main(String[] args) {
		
	              // 0 1 2 3 4 5 6 7 8 9
	int [] number = {1,2,3,4,5,6,7,8,9,10};
	
	System.out.println(number[1]);
	
	System.out.println("------------------------------");
	
	System.out.println(number.length);
	
	System.out.println("------------------------------");
	
	Arrays.sort(number);
	
	for(int i=number.length-1;i>=0;i--)
	{
		System.out.println(number[i]);
	}
}
}
