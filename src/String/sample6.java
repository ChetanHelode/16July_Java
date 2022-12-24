package String;

public class sample6 {
	
	public static void main(String[] args) {
		
		String name = "galaxy";
		String name1 = "GALAXY";
		String name2 = "GaLaXy";
		String name3 = "gAlAxY";
		
		System.out.println(name==name1);
		System.out.println(name==name2);
		System.out.println(name==name3);
		
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.equalsIgnoreCase(name3));
		
	}

}
