
package mypackage;

public class TernaryOperator {
	
	public static void main(String[] args) {

		

		// 1st example
		int number = 7361763;
		String result = (number % 2 == 0) ? "Even" : "Odd";
		System.out.println("Number is " + result);
		
		
		

		// 2nd example
		int number1 = 0;
		String result1= (number1 >= 0) ? "Positive" : "Negative";
		System.out.println("Number is " + result1);

		
		
		
		// 3rd example
		int age = 54;
		String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
		System.out.println(eligibility);

		
		
		
		// 4th example
		int marks = 85;
		String grade = (marks >= 50) ? "Pass" : "Fail";
		System.out.println("Grade: " + grade);

		
		
		
		// 5th example
		int x = 158, y = 837252877;
		int min = (x < y) ? x : y;
		System.out.println("Min: " + min);

		
	}
}