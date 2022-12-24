package Static_Nonstatic;

public class emp12 {
	
	public static void main(String[] args) {
		
		System.out.println("Student detail : \n");
		
		emp11 s1=new  emp11();
		s1.name="Chetan Helode";
		s1.ID=25361;
	//	s1.division= "1-A";
	//    s1.college="MIT";
	    emp11.division="2-B";
	    emp11.college="MIT";
	   
	    
	    emp11 s2=new emp11();
	    s2.name="Spandan Dhage";
	    s2.ID=25362;
	//    s2.division="2-B";
	//    s2.college="Dy patil";
	    emp11.division="3-C";
	    emp11.college="Dy Patil";
	    
	    
	    emp11 s3=new emp11();
	    s3.name="Pratik Chede";
	    s3.ID=25363;
	 // s3.division="3-A";
	 // s3.college="Govt Aurangabad";
	    emp11.division="1-A";
	    emp11.college="MIT\n";
	    
	    
	    s1.m1();
	    s2.m1();
	    s3.m1();
		
		
	}

}
