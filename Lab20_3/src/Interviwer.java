import java.util.Scanner;

public class Interviwer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		String name;
		System.out.print("What is your name? ");
		name = input.next(); 
		
		System.out.print("Their name is ");
		System.out.println(name);
		
		int birth;
		System.out.print("What year where you born? ");
		birth = input.nextInt(); 
		
		System.out.println("This person was born in the year of " + birth);
		
		int age;
		System.out.print("How old are you? ");
		age = input.nextInt(); 
		
		System.out.print(name + " is ");
		System.out.println(age + " years old.");
	
		String food;
		System.out.print("What is your favorite food? ");
		food = input.next(); 
		
		System.out.print(name + "\'s favorite food is ");
		System.out.println(food);
		
		String pets;
		System.out.print("Do you have any pets if so what is it?");
		pets = input.next(); 
		
		System.out.print(name + " has a ");
		System.out.println(pets); 
		
		
		
		
		
		
		
	}

}
