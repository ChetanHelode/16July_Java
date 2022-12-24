package Static_Nonstatic;

public class emp8 {
	
	public static void main(String[] args) {
		
		emp7 s1=new emp7();
		s1.name="chetan";
		s1.age=24;
		s1.team="team1";
		emp7.company="xyz\n";
		
		emp7 s2=new emp7();
		s2.name="spandan";
		s2.age=24;
		s2.team="team2";
		emp7.company="Abc\n";
		
		emp7 s3=new emp7();
		s3.name="pratik";
		s3.age=24;
		s3.team="team3";
		emp7.company="Abc\n";

        s1.m1();
        s2.m1();
        s3.m1();
		
	
	}

}
