package Static_Nonstatic;

public class emp6 {
	public static void main(String[] args) {
		
	
	emp5 s1=new emp5();
	s1.name="chetan";
	s1.age=25;
	emp5.company="accenture";
	
	emp5 s2=new emp5();
	s2.name="vaibhav";
	s2.age=24;
	emp5.company="reliance";
	
	emp5 s3=new emp5();
	s3.name="spandan";
	s3.age=24;
	emp5.company="infosys";
	
	s1.m1();
	s2.m1();
	s3.m1();
	
	}
	

}
