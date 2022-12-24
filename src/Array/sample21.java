package Array;

public class sample21 {
	public static void main(String[] args) {
		
	                     //0,0       0,1        1,0     1,1       2,0       2,1 
	String [][] names = {{"Honda","Hyundai"},{"Suzuki","Kia"},{"Mercedes","BMW"}};
	
	
	// honda hyundai
	// suzuki kia
	// mercedes BMW
	
	System.out.println(names[2][0]);
	System.out.println(names[0][1]);
	System.out.println(names[1][1]);
	
	System.out.println("-------------------------");
	
	for (int i = 0;i<=2;i++)
	{
		for(int j=0;j<=1;j++)
		{
			System.out.print(names[i][j]+"     ");
		}
		System.out.println("\n");
	}
	
/*   multi dimensional array through for each loop
 	for (String[] j : names)
	{
		System.out.println(j);
	}
	
	*/
}
}
