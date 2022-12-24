package Array;

public class sample12 {
	
	public static void main(String[] args) {
		
		//    0 1 2 (j=2)
		
//(i=3)		//0   10 20 30
		//1   40 50 60 
		//2   70 80 90
		//3   100 110 120
		
		int [][] ar3=new int[4][3];
		
		ar3[0][0]=10;
		ar3[0][1]=20;
		ar3[0][2]=30;
		ar3[1][0]=40;
		ar3[1][1]=50;
		ar3[1][2]=60;
		ar3[2][0]=70;
		ar3[2][1]=80;
		ar3[2][2]=90;
		ar3[3][0]=100;
		ar3[3][1]=110;
		ar3[3][2]=120;
		
		System.out.println(ar3[2][1]);
		System.out.println(ar3[3][1]);
		System.out.println(ar3[0][2]);
		
		System.out.println("------------------------------");
		
		for (int i=0;i<=3;i++ )
		{
			for(int j=0;j<=2;j++) 
			{System.out.print(ar3[i][j]+" ");
			}
			
			System.out.println();
			
			
			
}
	}

}
