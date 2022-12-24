package Static_Nonstatic;

public class emp16 {
	
	public static void main(String[] args) {
		
		
		emp15 s1=new emp15();
		s1.name="Sumit";
		s1.age=24;
		emp15.college="MIT";
		
		emp15 s2=new emp15();
		s2.name="Chetan";
		s2.age=25;
		emp15.college="MIT";
		
		emp15 s3=new emp15();
		s3.name="Shrikant";
		s3.age=24;
		emp15.college="xyz";
		
		s1.info();
		s2.info();
		s3.info();
	}

}
