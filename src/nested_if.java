
public class nested_if {
	
	public static void main(String[] args) {
		
		int prelims = 70;
		
		if(prelims>=55)  // 70>55
		{
			System.out.println("Eligible for mains exam");
			
			int mains= 120;
			
			if(mains>=100)
			{
				System.out.println("Eligible for Interview");
				
				  int PI=30;
				  
				  if(PI>=35)
				  {
					  System.out.println("Get selected");
					  
					  
					  
					  
					  
					  
					  
				  }
				  
				  else
				  {
					  System.out.println("Rejected");
				  }
				
			}
			
			else
			{
				System.out.println("Not eligible for interview");
			}
			
			
			
			
			
			
			
			
			
		}
		
		else
		{
			System.out.println("Not eligible for mains exam");
		}
		
	} 
	

}
