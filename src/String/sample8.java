package String;

public class sample8 {
	
	
	public static void main(String[] args) {
		
		String s1 = "my name is chetan";
		
		String [] ar = s1.split(" ");
		
		System.out.println(s1);
		
		System.out.println("-----------------------------");
		
		System.out.println(ar.length);
		
		// 0 - my
		// 1 - name
		// 2 - is
		// 3 - chetan
		
	   // print statements
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		System.out.println("-----------------------------");
		
		// for loop
		for (int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		System.out.println("-----------------------------");
		
		// for each loop
		for (String j : ar)
		{System.out.println(j);}
		
	}

}
