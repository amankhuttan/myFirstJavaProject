package mypackage;

public class ForEachLoopExamples {

	public static void main(String[] args) {

		// 1st example  
		
		String[] names = { "Ram", "Sham", "Kullu" };

		for (String name : names) {
		    System.out.println(name);  
		}
		
		for (int i = 0; i < names.length; i++) {
		    System.out.println(names[i]);
		}
		
		
		
		
		// 2nd example
		
		int[] numbers = {1, 2, 3, 4, 5};

		for (int num : numbers) {
		    System.out.println(num);
		}

		for (int i = 0; i < numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		
		
		//3rd example
		
		int sum = 0;

		for (int num : numbers) {
		    sum += num;
		}
		System.out.println("Sum: " + sum);
		
		for (int i = 0; i < numbers.length; i++) {
		    sum += numbers[i];
		}
		System.out.println("Sum: " + sum);
		
		
		
		
		
		// 4th example
		
		
		
	}

}
