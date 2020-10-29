import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will find the average of up to 10 numbers");

		Scanner input = new Scanner(System.in);
		
		int i = 1;
		double total = 0;
		int runningcount; 
		int sum = 0;  
		int x = 0; 

		System.out.print("Please choose amount of numbers to average: ");
		int count = input.nextInt(); 
		while (sum < count){ {
			System.out.print("Please enter " + i + " number: ");
			int num = input.nextInt();
			total += num; 
			i++; 
			x++;
			sum++;
		}
	}
	
		System.out.print("The average of all the numbers is: ");
		System.out.print((double)(total/x));
			
		
		if (count == 0 ) {
			System.out.print("The average of all the numbers is: "+ count);}}}
	


