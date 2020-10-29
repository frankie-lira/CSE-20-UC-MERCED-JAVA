import java.util.Scanner;

public class Errors7 {

	public static void main(String[] args) {

		System.out.println("*** This program will find the average of 5 numbers ***");

		Scanner input = new Scanner(System.in);

		int n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;

		System.out.print("Please enter the 0th number: ");
		n0 = input.nextInt();

		System.out.print("Please enter the 1st number: ");
		n1 = input.nextInt();

		System.out.print("Please enter the 2nd number: ");
		n2 = input.nextInt();

		System.out.print("Please enter the 3rd number: ");
		n3 = input.nextInt();

		System.out.print("Please enter the 4th number: ");
		n4 = input.nextInt();

		System.out.println("The average of 5 numbers is " + ((double)(n0 + n1 + n2 + n3 + n4)/5));
		
		// Only add up positive numbers and take the average
		int total = 0, count = 0;
		
		if (n0 > 0) {{
			total = total + n0;
			count = count + 1; 

		} if (n1 > 0) {
			// add "total +"
			total = total + n1;
			count++;
			
		} if (n2 > 0) {
			total = total + n2;
			count++;
		} if (n3 > 0) {
			total = total + n3;
			//delete + from += 
			count++;
			//switch the else statement to an else if
		} if (n4 > 0) {
			total = total + n4;
			count++;
		}
		
		System.out.println("Average of the positive numbers is " + (double) total/count);}
	}
}