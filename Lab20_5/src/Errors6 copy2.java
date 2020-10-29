import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		
		
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number:");
		n1 = input.nextInt();

		System.out.print("Please enter the second number:");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);
		//deleting Scanner input = new Scanner(System.in); that was below//
		
		// Renaming n1 so it cannot copute the past numbers.//
		float b1, b2;
		//changing n1 to b1//
		System.out.print("Please enter the first number:");
		b1 = input.nextFloat();
		//changing n2 to b2//
		System.out.print("Please enter the second number:");
		b2 = input.nextFloat();
		//Changing "Average" so it can't compute the past operation//
		
		//rename average//
		float floatavg;
		floatavg  = (b1+b2)/2;
		System.out.println("The average of the numbers is " + floatavg);

		short s1, s2;

		System.out.print("Please enter the first number:");
		s1 = input.nextShort();

		System.out.print("Please enter the second number:");
		s2 = input.nextShort();

		short shortAvg;
		//add ()//
		shortAvg = (short)((s1+s2)/2);
		System.out.print("The average of the numbers is " + shortAvg);

		input.close();
		
	
			}

	}





