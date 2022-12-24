package Array;

public class sample22 {
	//Example 1. create a float array of 5 and sum
	
	public static void main(String[] args) {
		
		float [] ar = {100f,99.5f,98.7f,97.8f,96.4f};
		 System.out.println("----------------");
		// first method
		System.out.println(ar[0]+ar[1]+ar[2]+ar[3]+ar[4]);
		
		 System.out.println("----------------");
		// second method
	
		for(int i = 0;i<=4;i++)
		{   
			float sum = 0;
			sum = sum+ar[i];
			System.out.println(sum);
		}
		
		 System.out.println("----------------");
		// third method
		float sum1 = 0;
		for (float j : ar)
		{
			sum1 = sum1 + j;
			System.out.println(sum1);
		}
		 System.out.println("----------------");
	}

}
