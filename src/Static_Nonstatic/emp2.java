package Static_Nonstatic;

public class emp2 {
	
	public static void main(String[] args)
	{
		emp1 e1=new emp1();
		e1.empName="rahul";
		e1.empID=101;
		emp1.empCEOName="abc";
				
		emp1 e2=new emp1();
		e2.empName="ganesh";
		e2.empID = 102;
		emp1.empCEOName="abc";
		
		emp1 e3=new emp1();
		e3.empName="Pooja";
		e3.empID=103;	
		emp1.empCEOName="xyz";
		
		e1.showInfo();
		e2.showInfo();
		e3.showInfo();		
	}

}
