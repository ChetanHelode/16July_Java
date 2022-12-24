package Array;

public class EX4 {
	public static void main(String[] args) {
		
		int [][] num = new int[2][3];
		num[0][0]=21;
		num[0][1]=22;
		num[0][2]=23;
		num[1][0]=24;
		num[1][1]=25;
		num[1][2]=26;
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
			
		}
		
	
		
		String [][] name = {{"chetan","spandan"},{"vaibhav","pratik"}};
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
			System.out.print(name[i][j]+" ");
			}
			System.out.println();
	    }
		
		
		for( int[] numbers : num)
		{
			System.out.println(numbers);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
