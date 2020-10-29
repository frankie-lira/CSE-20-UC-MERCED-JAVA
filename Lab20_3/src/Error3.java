import java.util.Scanner;

public class Error3 {

	public static void main(String[] args) {
		//Scanner kbd = new Scanner system.in;
		Scanner kbd = new Scanner(System.in);
		//Int numerator;//
		int numerator;
		//integer denominator;//
		int denominator;
		//System.println("This program divides two numbers.");//
		System.out.println("This program divides two numbers.");
		//System.print("Enter the numerator: ");//
		System.out.print("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		//denomintaor = kbd.nextInt();//
		denominator = kbd.nextInt();
		//system.out.print(numerator);
		System.out.print(numerator);
		System.out.print("/");
		//system.out.Print(denominator);//
		System.out.print(denominator);
		System.out.print(" = ");
		//System.out.Println((double) numerator/denominator);//
		System.out.println((double) numerator/denominator);
	}
} //added {} to complete class body//