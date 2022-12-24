package Array;

public class sample2 {
	
	public static void m1()
	{
		int [] obj=new int[4];
		obj[0]=0;
		obj[1]=1;
		obj[2]=2;
		obj[3]=3;
		
		
		System.out.println(obj[3]);

		for(int a=3;a>=0;a--)
		{
			System.out.println(obj[a]);
		}
		
	}
		
	
	public static void main(String[] args) {
    m1();
	}
}
