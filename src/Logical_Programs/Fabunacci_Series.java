package Logical_Programs;

public class Fabunacci_Series {
	
	public static void main(String[] args) {
		System.out.println("1-20");
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a+" "+b);
		for(int i=2;i<6;i++)
		{   // 2<6 true - 1=0+1   , a=1  b=1
			// 3<6 true - 2=1+1   , a=1  b=2
			// 4<6 true - 3=1+2   , a=2  b=3
			// 5<6 true - 5=2+3  ,  a=3  b=5
			// 6<6 false.......
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}
	}
}
