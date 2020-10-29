import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program prints out multiples of a given number till a specified maximum.");
		System.out.print("Please enter the maximum number:");
		int max = input.nextInt();
		System.out.print("Please enter the number whose multiples to print:");
		int mul = input.nextInt();
		System.out.println("Multiples of " + mul + " from 1 till " + max + " are:");
		
		int i = 0;
		
		for (i = 1; i <= max;  i = i + 1){
				 
		
			if (i % mul == 0)		
			System.out.println("Number " + i);}
	}

}
