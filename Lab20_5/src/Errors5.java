import java.util.Scanner;

	public class Errors5 {
		public static void main(String[] args) {
		
		Scanner keyboard;
			
		System.out.print("What is your weight in kg? " );
		
		//Scanner keyboard;// shoudl go first and //keyboard = new Scanner(System.in);// should go after
		keyboard = new Scanner(System.in);
		
		int weight, age;
		
		// weight = keyboard .nextInt();// should be after// int weight, age;//
		weight = keyboard.nextInt();
		
		System.out.print("What is your age? ");
		
		age = keyboard.nextInt();
		
		System.out.println("Wow you are " + (int) (age*6.9) + " in dog years.");

		//add () to (weight * 2.2)//

		System.out.println("Your weight in lbs is " + (int) (weight * 2.2) + " with no decimal point");
		
	
	}
	
}

