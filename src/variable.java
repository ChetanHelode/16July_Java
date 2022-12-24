
public class variable {
	
	int num1 = 21;
	int num2 = 25;
	static String name = "Shubham";
	
	public static void main(String[] args) {
		
		variable num=new variable();                 // create object 
		System.out.println(num.num1+num.num2);       // objname.variablename -->(same and diff class)
		
		System.out.println(name);  // variablename --> same class
		System.out.println(variable1.name);   //classname.variablename  --> diff class
		
	}

}
