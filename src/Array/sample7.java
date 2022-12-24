package Array;

import java.util.Arrays;

public class sample7 {
	
	public static void main(String[] args)
	{
		String [] ar=new String[5];
		
		ar[0]="rahul";
		ar[1]="ganesh";
		ar[2]="suresh";
		ar[3]="mahesh";
		ar[4]="ramesh";
						
		System.out.println("---Original data---");
		
		for(int i=0; i<=ar.length-1; i++)
		{  
			System.out.println(ar[i]);   
		}
		
		Arrays.sort(ar);
		System.out.println("----after sorting------");
		for(int i=0; i<=ar.length-1; i++)
		{  
			System.out.println(ar[i]);   
		}
		
	}

}
