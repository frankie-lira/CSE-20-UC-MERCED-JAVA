import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		double num = input.nextInt();
		
		if (num > 0 && num < 27)
		System.out.println("You have entered " + (char) (num + 64));
	
		else
			System.out.println("Number is out of acceptable range.");
		
		
	}

}
