package String;

public class EX4 
{
	public static void main(String[] args)
	{
		String name = "Chetan";
		String name1 = "chetan";
		String name2 = "Ichigo";
		
		System.out.println(name2.charAt(3));
		System.out.println(name2.indexOf('I'));
		System.out.println(name.replace("n", "N"));
		System.out.println(name.substring(3,5));
		
		System.out.println(name1.startsWith("C"));
		System.out.println(name2.endsWith("o"));
		System.out.println(name2.contains("chi"));
		
		System.out.println(name1.concat(name2));
		System.out.println(name.isEmpty());
		System.out.println(name2.lastIndexOf('i'));
		
	}

}
