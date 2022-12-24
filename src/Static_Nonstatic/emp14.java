package Static_Nonstatic;

public class emp14 {
	
	public static void main(String[] args) {
		
		System.out.println("Career :\n");
		emp13 s1=new emp13();
		s1.name="chetan";
		s1.joinyear=2014;
		s1.ID=25362;
		emp13.company="IBM";
		
		emp13 s2=new emp13();
		s2.name="chetan";
		s2.joinyear=2016;
		s2.ID=35362;
		emp13.company="Accenture";
		
		emp13 s3=new emp13();
		s3.name="chetan";
		s3.joinyear=2018;
		s3.ID=45362;
		emp13.company="TCS";
		
		emp13 s4=new emp13();
		s4.name="chetan";
		s4.joinyear=2020;
		s4.ID=55362;
		emp13.company="Infosys\n";
		
		
		
		
		s1.m1();
		s2.m1();
		s3.m1();
		s4.m1();
		
	}

}
