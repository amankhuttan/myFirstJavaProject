package mypackage;

public class Calculatorr {
	
	//addition 
	public void addition (int a, int b)
	{ 
		int sum=a+b;
		System.out.println("Addition is: " +sum);
	}
	
	
	//subtraction
	public void subtraction (int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtraction is: " +sub);
	}
	
	
	//multiplication
	public void multiplication (int a, int b)
	{
		int multi=a*b;
		System.out.println("Multiplication is: " +multi);
	}
	
	
	//division
    public void division (int a, int b)
    {
    	double div=a/b;
    	System.out.println("Division is: " +div);
    }
    
    
    
	public static void main ( String [] args) {
		
		int a=66;
		int b=30;
		
		Calculatorr calc = new Calculatorr();
		
		calc.addition(a, b);
		calc.subtraction(a, b);
		calc.multiplication(a, b);
        calc.division(a, b);
        
	}
}
