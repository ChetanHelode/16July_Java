package String;

public class sample7 {
	
	public static void main(String[] args) {
		
		String s1 = "velocity";
		String s2 = "SPIDER MAN";
		String s3 = "GALAXYA";
		String s4 = "my name is Krishnna ";
		String s5 = "";
		String s6 = " ";
		String s7 = "pqrs";
		String s8 = "VELOCITY";
		
		// length
		System.out.println(s4.length());
		
		// upper case
		System.out.println(s1.toUpperCase());
		
		//lower case
	    System.out.println(s2.toLowerCase());
	    
	    //equals   (answer in boolean)
	    System.out.println(s1.equals(s8));
	    
	    // equals ignore case  (answer in boolean)
	    System.out.println(s1.equalsIgnoreCase(s8));
		
	    //contains boolean 
	    System.out.println(s7.contains("r"));
	    
	    //empty
	    System.out.println(s6.isEmpty());
	    
	    //charater at
	    System.out.println(s7.charAt(2));
	    
	    //index of
	    System.out.println(s3.indexOf('A'));
	    
	    //last index
	    System.out.println(s3.lastIndexOf('A'));
	    
	    //starts with  (answer in boolean) 
	    System.out.println(s2.startsWith("S"));
	    
	    //ends with
	    System.out.println(s7.endsWith("s"));
	    
	    //substring
	    System.out.println(s1.substring(2));
	    System.out.println(s8.substring(2,6));  // 2,3,4,5
	    
	    //concat
	    System.out.println(s1.concat(s2));
	    System.out.println(s1.concat(" ").concat(s2));
	    System.out.println(s1+s2);
	    
	    //replace
	    System.out.println(s1.replace("y", "ee"));
	   
	}

}
