package String;

public class sample10 {
	
	public static void main(String[] args) {
		
		String name = "chetan";
		String name1 = "CHETAN";
		String name2 = "Ichigo";
		
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name1.toLowerCase());
		System.out.println(name1.charAt(3));
		System.out.println(name2.indexOf('i'));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.replace("c", "C"));
		System.out.println(name2.substring(1,4));
		System.out.println(name2.startsWith("I"));
		System.out.println(name2.endsWith("o"));
		System.out.println(name.contains("chetan"));
		System.out.println(name.concat(name2));
		System.out.println(name.isEmpty());
		System.out.println(name2.lastIndexOf('i'));
		
	}
}


