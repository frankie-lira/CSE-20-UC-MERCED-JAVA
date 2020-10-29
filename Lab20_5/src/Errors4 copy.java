import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner kbd;

		System.out.println("Enter two ints and we print out sum as an int.");
		//add ln/ and move this string before "kbd = new Scanner(System.in);" //
		System.out.println("Enter the first number: ");
		
		kbd = new Scanner(System.in);

		n1 = kbd.nextInt();
		//add ln//
		System.out.println("Enter the second number: ");
		//Change short to int//
		n2 = kbd.nextInt();
		//change float to int//
		System.out.println("The sum of the numbers is " + (int)(n1+n2));
	}

}