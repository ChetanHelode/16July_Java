package Array;

public class EX1 {

	public static void main(String[] args) {
		
		String [] s1 = new String[4];
		
		s1[0]="Chetan";
		s1[1]="Vaibhav";
		s1[2]="Spandan";
		s1[3]="Pratik";
		
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		
		System.out.println(s1.length);
		
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		
		for(String s2:s1)
		{
			System.out.println(s2);
		}
		
		
	}
	
}
