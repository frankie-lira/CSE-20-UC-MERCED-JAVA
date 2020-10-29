import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please choose number of values to average: ");
		int max = input.nextInt(); 

		if (max == 0 ) {
			System.out.print("No numbers to average. Exiting program.");}
		else
		{
			int[] arr1 = new int[max + 1];
			int i = 1;
			double total = 0;  
			int x = 0; 

			System.out.print("Please choose column width for output formatting: ");
			int col = input.nextInt(); 


			while (i <= max) {
				System.out.print("Please enter value #"+ i +":");
				arr1[i] = input.nextInt();
				total += arr1[i];
				x++;
				i++;
			}
			System.out.println();
			i = 1;
			System.out.println("The numbers being averaged are ...");
			while (i <= max) {
				System.out.print(arr1[i]+ " ");

				if ((i % col) == 0) {
					System.out.print("\n");
				}
				i++;
			}

			i = 1;
			System.out.println();
			System.out.print("The average is: ");
			System.out.print((double)(total/x));

		}

	
	}
}
