
public class emp1 {
	
	String emp1;
	int emp1age;
	String companyCEO;
	
	public emp1()
	{
		emp1 = "emp1";
		emp1age = 24;
		companyCEO = "Xyz";
	}
	
	public void mtd1()
	{
		System.out.println(emp1);
		System.out.println(emp1age);
		System.out.println(companyCEO);
	}
	
	public static void main(String[] args) {
		emp1 s1=new emp1();
		s1.mtd1();
	}

}
