import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int i = 1;
		double total = 0;  
		double count = 0 ;
		double num = 0; 


		System.out.println("Enter 0 or less to stop entering numbers.");

		do {
			System.out.print("Enter value #"+ i + ":  ");
			num = input.nextInt();
			if (num < 0)
			{
				i++; 
				count++;
			}
			else 
			{
				total += num; 
				i++; 
				count++;
			}

		}

		while (num > 0);

		if (count == 1)
		{
			System.out.print("No positive numbers were input.");
		}

		else {

			System.out.print("Average is: ");
			System.out.print((double)(total/(count-1)));
		}
	}
	
}

