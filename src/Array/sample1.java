package Array;

public class sample1 {

	public static void main(String[] args) {
		
		//datatype   []   objectname =   new    datatype    [size]
		  String [] s1=new String[10];
		  
		  
		//objectname [size] = information
		// index -  0,1,2,3,4,5,6,7,8,9
		s1[0]="zero";
		s1[1]="one";
		s1[2]="two";
		s1[3]="three";
		s1[4]="four";
		s1[5]="five";
		s1[6]="six";
		s1[7]="seven";
		s1[8]="eight";
		s1[9]="nine";
		
		//System.out.println(objectname[index]);
		
		System.out.println(s1[2]);
		System.out.println(s1[5]);
		System.out.println(s1[7]);
		System.out.println(s1[9]);
		
		//System.out.println(Objectname.length);
		
		System.out.println(s1.length);
		
		System.out.println("---------------------------------------");
		
		for(int i=0;i<=9;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
