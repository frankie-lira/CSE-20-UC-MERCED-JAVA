import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		int i = 0; 
		int total = 0; 
		while ( i <= max) {
			System.out.println("Number " + i + " sqaured is "+ (i * i));
			total += i*i;
			i++;
			
		}
			System.out.print("The sum of squares of all numbers from " + 0 + " till " + max + " is: ");
			System.out.print(total);
	}

}
