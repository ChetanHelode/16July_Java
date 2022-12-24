package String;

public class sample15 {
	 //   0  1  2  3
	
	// 0        *                                  *
	// 1      * * *                              *   *
    // 2    *   *   *
	
	public static void main(String[] args) {
		int i,j,k;
		for (i=1;i<=3;i++)
		{   
			for(j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			for (k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
  
		
	    int a,b,c;
			for (a=1;a<=3;a++)
			{   
				for(b=1;1<b;b++)
				{ 
					System.out.print("");
				}
				for (c=1;c<=a;c++)
				{
					System.out.print("* ");
				}
				System.out.println("\n");
			}
		
		int space = 0;
		int star = 1;
		for(int x=1;x<=3;x++)
		{
//			for(int y=1;y<=space;y++)
//			{
//				System.out.print(" ");
//			}
//			
			for(int z=1;z<=star;z++)
			{
				System.out.print("* ");
			}
		   
			System.out.println("\n");
		//	space++;
			star++;
		}
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
}
