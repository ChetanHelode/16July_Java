package Static_Nonstatic;

public class emp4{
	
	public static void main(String[] args) {
	
		emp3 obj1=new emp3();
		obj1.emp = "Vaibhav";
		obj1.empage =24;
		emp3.companyCEO = "xyz";
		
		obj1.mtd1();
		
		emp3 obj2=new emp3();
		obj2.emp = "Chetan";
		obj2.empage = 25;
		emp3.companyCEO = "abc";
		
		obj2.mtd1();
	}

}
