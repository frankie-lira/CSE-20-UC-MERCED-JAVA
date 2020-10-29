import java.util.Scanner;

public class Errors1 {

	public static void main(String[] args) {
	//moved this string from line 15 to the top//
	Scanner keyboard = new Scanner(System.in);
	//System.out.println("Can you spot and fix the errors?');//
		System.out.println("Can you spot and fix the errors?");

		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you.");

		int n1, n2;
		//n1 = nextInt();//
		n1 = keyboard.nextInt();
		//n2 = nextint();//
		n2 = keyboard.nextInt();
	
		
		//System.println("The sum of the numbers is");//
		System.out.println("The sum of the numbers is");
		System.out.println(n1 + n2);
	}
}