import java.util.Scanner;

public class Interviewer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				
				System.out.println("What is your full name?");
				String name1 = sc.nextLine();
				
				
				System.out.println("What is your favorite food? ");
				
				sc.nextLine(); 
				
				String food = sc.nextLine();
				
				String hobbies;
				System.out.println("Do you have any hobbies? if so what are they?");
				
				sc.nextLine();
				
				hobbies = sc.nextLine(); 
			
				
				int birth;
				System.out.print("What year where you born? ");
				birth = sc.nextInt(); 
				
				int age;
				System.out.print("How old are you? ");
				age = sc.nextInt(); 
				
				
				float height;
				System.out.print("What is your height in inches?");
				
				height = sc.nextFloat();
				
				//--------------------------------------------/
				
				
				System.out.print("Your name is " + name1 + ","+ " and your birth year is " + birth + ". ");
				System.out.println("You are " + age + " years old and you are " + ((float) (height * 2.54)) + " inches tall.");
				System.out.print("Your favorite food is " + food + ". ");
				System.out.println("You also told me that you like to " + hobbies +".");
				
				
			
			
					
		
	}

}
