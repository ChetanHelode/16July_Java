package String;

public class sample12 {
	
	public static void main(String[] args) {
		
		String s1 = "Chetan";
		String s2 = "Information Technology";
		String s3 = "My name is abc";
		String s4 = "INFORMATION TECHNOLOGY";
		String s5 = "Chetan Helode";
		
		s3=s3.replace("abc", "Chetan");
		System.out.println(s3);
		
		System.out.println("\n--------length-----------");
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println("\n--------upper case-----------");
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		
		System.out.println("\n--------lower case-----------");
		System.out.println(s4.toLowerCase());
		
		System.out.println("\n--------equals-----------");
		System.out.println(s2.equals(s4));

		System.out.println("\n--------equals ignore case-----------");
		System.out.println(s2.equalsIgnoreCase(s4));
		
		System.out.println("\n--------upper case + equals-----------");  // convert in upper case and then check equals
		System.out.println(s2.toUpperCase().equals(s4));
		
		System.out.println("\n--------lower case + equals-----------");  // convert in lower case and then check equals
		System.out.println(s4.toLowerCase().equals(s2));
		
		System.out.println("\n--------contains-----------");
		System.out.println(s3.contains("abc"));   // old information
		System.out.println(s3.contains("Chetan"));  // replace new information
		
		System.out.println("\n--------empty-----------");
		System.out.println(s2.isEmpty());
		
		System.out.println("\n--------character at-----------");
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(5));
		
		System.out.println("\n--------index of-----------");
		System.out.println(s1.indexOf('C'));
		System.out.println(s1.indexOf('n'));
		
		System.out.println("\n--------last index-----------");
		System.out.println(s4.lastIndexOf('I'));
		
		System.out.println("\n--------substring-----------");
		System.out.println(s3.substring(11));
		System.out.println(s3.substring(3,7));
		
		System.out.println("\n--------replace-----------");
		System.out.println(s4.replace("INFORMATION TECHNOLOGY","Information Technology"));
		
		System.out.println("\n---------replace + equals-----------");
		System.out.println(s4.replace("INFORMATION TECHNOLOGY","Information Technology").equals(s2));
		
		System.out.println("\n--------Split-----------");
		
		String [] ar = s5.split(" ");
		
		System.out.println(ar.length);
		
		for(int i=0;i<=1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
