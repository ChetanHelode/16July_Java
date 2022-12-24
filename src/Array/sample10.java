package Array;

public class sample10 {
	
	public static void main(String[] args)
	{
	
	//      0  1
		
	// 0    10 20
	// 1    40 50
		
		
		int [][] ar=new int[2][2];
		
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=40;
		ar[1][1]=50;
		
		
		System.out.println(ar[1][1]);
		
		System.out.println("--print all data--");
		
		//          
		for(int i=0; i<=1; i++)   //outer for loop  --> rows
		{        //      
			for(int j=0; j<=1; j++)   //inner for loop --> cols
			{  //                  1   2
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
		
		//10 20
		//40 50
		//
	}
	
	

}
