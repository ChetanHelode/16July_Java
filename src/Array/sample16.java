package Array;

public class sample16 {
	
	
	
	public static void main(String [] args) {
		
    int [] number=new int [5];
		
	number[0]=20;
	number[1]=40;
	number[2]=60;
	number[3]=80;
	number[4]=100;
	int sum=0;
	for(int i=0;i<=4;i++)
	{   
	    
		System.out.println(number[i]);
		sum = sum+number[i];
	}
	System.out.println("\nSum = "+sum);
	}
}
