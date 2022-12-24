package Array;

public class sample15 {
	
	public static void main(String[] args) {
		
		int [][] number=new int[4][5];
		
		number[0][0]=21;
		number[0][1]=22;
		number[0][2]=23;
		number[0][3]=24;
		number[0][4]=25;
		
		number[1][0]=31;
		number[1][1]=32;
		number[1][2]=33;
		number[1][3]=34;
		number[1][4]=35;
		
		number[2][0]=41;
		number[2][1]=42;
		number[2][2]=43;
		number[2][3]=44;
		number[2][4]=45;
		
		number[3][0]=51;
		number[3][1]=52;
		number[3][2]=53;
		number[3][3]=54;
		number[3][4]=55;
		
		
		for(int row=0; row<=3; row++)
		{
			for(int col=0; col<=4; col++ )
			{
				System.out.print(number[row][col]+" ");
			}
			System.out.println();
			
			
			
		}
		
	}

}
