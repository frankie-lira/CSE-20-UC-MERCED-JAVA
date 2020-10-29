import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		int total = 0; 
		int i; 
		int total1 = 0; 
		 
		
		for (i = 0; i <= max;  i = i + 1){
			System.out.println("Number " + i);
			total1 += i;
				
		}
			System.out.print("The sum of all numbers from 0 till " + max + " is: ");
			System.out.print(total1);
	}

}
