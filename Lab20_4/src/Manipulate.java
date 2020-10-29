import java.util.Scanner;

public class Manipulate
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st number");
		int nInt1 = input.nextInt();
		System.out.println("Please enter the 2nd number");
		int nInt2 = input.nextInt();
		System.out.println("When you add the 1st number and the 2nd you get " + (int)(nInt1 + nInt2) + "." );
		System.out.println("When you subtract n1 and n2 you get " + (int) (nInt1 - nInt2) + ".");
		System.out.println("When you multiply n1 and n2 you get " + (int) (nInt1 * nInt2) + "." );
		System.out.println("When you divide n1 and n2 you approximately get " + (int) (nInt1 / nInt2) + ".");
		System.out.println("The reminder is " + (int) (nInt1 % nInt2) + ".");
		
		
		
		System.out.println("Enter a short number");
		short nShort1 = input.nextShort(); 
		System.out.println("Enter the 2nd short number");
		short nShort2 = input.nextShort();
		System.out.println("When you add the 1st number and the 2nd you get " + (short) (nShort1 + nShort2) + "." );
		System.out.println("When you subtract n1 and n2 you get " + (short) (nShort1 - nShort2) + ".");
		System.out.println("When you multiply n1 and n2 you get " + (short) (nShort1 * nShort2) + "." );
		System.out.println("When you divide n1 and n2 you approximately get " + (short) (nShort1 / nShort2) + ".");
		System.out.println("The reminder is " + (short)(nShort1 % nShort2 ) + ".");
		
		System.out.print("Enter a float number");
		float nFloat1 = input.nextFloat();
		System.out.println("Enter the 2nd float number");
		float nFloat2 = input.nextFloat();
		System.out.println("When you add the 1st number and the 2nd you get " + (float)(nFloat1 + nFloat2) + "." );
		System.out.println("When you subtract n1 and n2 you get " + (float) (nFloat1 - nFloat2) + ".");
		System.out.println("When you multiply n1 and n2 you get " + (float) (nFloat1 * nFloat2) + "." );
		System.out.println("When you divide n1 and n2 you approximately get " + (float) (nFloat1 / nFloat2) + ".");
		System.out.println("The reminder is approximately " + (float) (nFloat1 % nFloat2) + ".");
		
		System.out.println("Enter a double number");
		double nDouble1 = input.nextDouble();
		System.out.println("Please enter the 2nd double number");
		double nDouble2 = input.nextDouble();
		System.out.println("When you add the 1st number and the 2nd you get " + (double)(nDouble1 + nDouble2) + "." );
		System.out.println("When you subtract n1 and n2 you get " + (double) (nDouble1 - nDouble2) + ".");
		System.out.println("When you multiply n1 and n2 you get " + (double) (nDouble1 * nDouble2) + "." );
		System.out.println("When you divide n1 and n2 you approximately get " + (double) (nDouble1 / nDouble2) + ".");
		System.out.println("The reminder is " + (double) (nDouble1 % nDouble2) + ".");
	}
}
