package String;

public class sample5 {
	
	// Uppercase
	//Lowercase
	//Length
	
	public static void main(String[] args) {
		
		String name = "chetan";
		int age = 24;
		String college = "MIT";
		String hometown = "Khamgaon";
		
		System.out.println("-----------original data-----------");
		System.out.println(name);
		System.out.println(age);
		System.out.println(college);
		System.out.println(hometown);
		
		System.out.println("--------------Capital letters--------------");
		System.out.println(name.toUpperCase());
		System.out.println(age);
		System.out.println(college.toUpperCase());
		System.out.println(hometown.toUpperCase());
		
		System.out.println("---------------small letters---------------");
		System.out.println(name.toLowerCase());
		System.out.println(age);
		System.out.println(college.toLowerCase());
		System.out.println(hometown.toLowerCase());
		
		System.out.println("-----------------Length---------------");
		System.out.println("Size : "+name.length());
		System.out.println("Size : "+college.length());
		System.out.println("Size : "+hometown.length());
		
		
		
		
		
	}

}
