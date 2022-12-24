package String;

public class sample2 {
	
	// string pool area
	
	
	public static void main(String[] args) 
	
	{
		//1. constant pool area
		
	String s1="abc";
	
	String s2="ABC";
	
	String s3 = "ABc1";
	

	System.out.println(s1==s2);
	
	System.out.println(s1==s3);
			
			//2. non constant pool area
			
			String s4=new String("abc");
			
			String s5=new String("abc");
			
			String s6 =new String ("abc1");
			
			
			System.out.println(s4==s5);
			
			System.out.println(s4==s6);
	
	
			System.out.println(s1.length());
			
			System.out.println(s2.toUpperCase());
			
			System.out.println(s3.toLowerCase());
			
			System.out.println(s1.equals(s2));
			
			System.out.println(s1.equalsIgnoreCase(s2));
	
	}
}
