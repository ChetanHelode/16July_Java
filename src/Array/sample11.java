package Array;

public class sample11 {
	public static void main(String[] args) {
		
	
		int [][] ar=new int[3][4];
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[0][3]=80;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=70;
		ar[1][3]=100;
		ar[2][0]=40;
		ar[2][1]=50;
		ar[2][2]=70;
		ar[2][3]=100;
		
		
		System.out.println(ar[1][1]);
		
		System.out.println("--print all data--");
		
		//          
		for(int i=0; i<=2; i++)   //outer for loop  --> rows
		{        //      
			for(int j=0; j<=3; j++)   //inner for loop --> cols
			{  //                  1   2
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
    }
    
    

}
