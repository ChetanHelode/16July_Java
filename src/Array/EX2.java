package Array;

import java.util.Arrays;

public class EX2 {
	
	
	public static void main(String[] args) {
		
    int [] numbers = {1,2,3,4,5,6,8,55,25,14};
    
    int sum=0;
    
    for(int i=numbers.length-1;i>=0;i--)
    {
    	System.out.println(numbers[i]);
        sum=sum+numbers[i];
    }
    
    System.out.println(sum);
 
    
    System.out.println("--print info in ascending order--");
    
    
    Arrays.sort(numbers);
    for(int number:numbers)
    {
    	System.out.println(number);
    }
		
	}

}
