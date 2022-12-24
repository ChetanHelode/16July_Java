package Array;

import java.util.Arrays;

public class sample13 {
	
	public static void main(String[] args) {
		
		
		
		String [] name = {"Chetan","Spandan","Vaibhav","Shrikant"};
		
		System.out.println(name[1]);
		
		System.out.println("------------------------------");
		
		System.out.println(name.length);
		
		System.out.println("------------------------------");
		
		Arrays.sort(name);
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		
		
	}

}
