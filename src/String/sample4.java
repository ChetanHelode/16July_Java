package String;

public class sample4 {
	
	String name = "Chetan";
	String middlename = "Sanjay";
	String surname = "Helode";
	
	String name1 = "CHETAN";
	
	
	public static void main(String [] args)
	{
		sample4 s1=new sample4();
		
	System.out.println(s1.name+" "+s1.middlename+" "+s1.surname);
	System.out.println(s1.name.toUpperCase()+" "+s1.middlename.toUpperCase()+" "+s1.surname.toUpperCase());
	
	System.out.println(s1.name==s1.surname);
	
	System.out.println(s1.name.equals(s1.name1));
	
	System.out.println(s1.name.equalsIgnoreCase(s1.name1));
	
	
	}
	
	
			

}
