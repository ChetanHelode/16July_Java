package String;

public class EX1 {
	
	
	public static void main(String[] args) {
		
		String name = "chetan";
		String name1 = "Chetan";
		
		String name2 = new String("spandan");
		String name3 = new String("Spandan");
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name2.length());
		System.out.println(name2.toUpperCase());
		System.out.println(name2.toLowerCase());
		System.out.println(name2.equals(name3));
	    System.out.println(name2.equalsIgnoreCase(name3));
	}
	

}
