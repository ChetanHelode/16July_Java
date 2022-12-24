package Static_Nonstatic;

public class emp10 {
	public static void main(String[] args) {
		
	
	emp9 s1=new emp9();
	s1.name="chetan";
	s1.age=24;
	// s1.team="team1";
	// s1.company="Abc\n";
	emp9.team="team1";
	emp9.company="Abc";     // static variable info same as last info from s3 object
	
	emp9 s2=new emp9();
	s2.name="spandan";
	s2.age=24;
	// s2.team="team2";
	// s2.company="Abc\n";
	emp9.team="team2";
	emp9.company="Abc";   //  static variable info same as last info from s3 object
	
	
	emp9 s3=new emp9();
	s3.name="pratik";
	s3.age=24;
	// s3.team="team3";
	// s3.company="Abc\n";
	emp9.team="team3";
	emp9.company="Abc\n";   //  static variable info same as last info from s3 object
	
	s1.m1();
	s2.m1();
	s3.m1();
 
     }
}
