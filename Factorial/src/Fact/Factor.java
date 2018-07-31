package Fact;

public class Factor {

	public static void Factorial(Integer f) {
		
		
		 Integer i,n;
		
		 n=f;
		
	 for(i=1; i<n; i++){
		 
		f=f*i;
		 
	 }//for
	 
	 System.out.println("\nFactorial: " +f);
	}
}
