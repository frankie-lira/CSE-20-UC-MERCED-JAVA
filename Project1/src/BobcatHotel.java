import java.util.Scanner;

public class BobcatHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		int room = 0; 
		int nights;
		int guests; 
		double aaa = 0; 
		int club = 0; 
		double pcost = 0;   
		int meal = 0; 
		double broomcost = 0; 
		double tcost = 0;
		double clubd = 0;
		double mealcost = 0; 


		System.out.println("ROOM OPTIONS\n" + 
				"1. Single @ $50.50 per night\n" + 
				"2. Double @ $75.00 per night\n" + 
				"3. Queen @ $100.75 per night\n" + 
				"4. King @ $150.25 per night\n" + 
				"5. Master Suite @ $225.50 per night\n");

		System.out.print("Number of guests:");
		guests = keyboard.nextInt();
		System.out.print("Please enter your choice of room (enter 1/2/3/4/5 corresponding to the options shown above):");
		room = keyboard.nextInt();	
		if ((room > 5)||(room < 1)) { 
			System.out.print("Your choice is invalid, please select a number that is between the range of 1-5");
			room = keyboard.nextInt();}
		System.out.print("Please enter the number of nights:");
		nights = keyboard.nextInt();

		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)?");
		aaa = keyboard.nextInt();
		if ((aaa > 1)||(aaa < 0)) { 
			System.out.println("Your choice is invalid, please select number's 1 or 0.");
			aaa = keyboard.nextInt();}

		System.out.print("Are you a club member (enter 1 for yes, 0 for no)?");
		club = keyboard.nextInt();
		System.out.print("\n");
		if ((club > 1)||(club < 0)) { 
			System.out.println("Your choice is invalid, please select number's 1 or 0.");
			club = keyboard.nextInt();}

		if ((nights < 4)||(nights > 8))
		{System.out.println("Unfortunately, you didn't qualify for our \"Stay 4 nights get 5th free promotion\".\n Better luck next time!");}

		else if ((nights >= 4)||(nights <= 8))
		{System.out.println("Congratulations! You've qualified for our \"Stay 4 nights get 5th free promotion\"\n"
				+ "Dicount will be applied to checkout depending on the number of nights.\n");}

		if (room == 5) 
		{{System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\n" + 
				"0. Complementary @ $0 per guest\n" + 
				"1. Standard @ $30 per guest\n" + 
				"2. Deluxe @ $50 per guest\n" + 
				"3. Indulgence @ $85 per guest\n");
		System.out.print("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above:" );
		meal = keyboard.nextInt();}
		if ((meal > 3)||(meal < 0)) 
		{System.out.print("Your choice is invalid, please select a number that is between the range of 0-2");
		meal = keyboard.nextInt();}}

		else 
		{{System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\n" + 
				"0. Complementary @ $0 per guest\n" + 
				"1. Standard @ $30 per guest\n" +
				"2. Deluxe @ $50 per guest\n");
		System.out.println("Please select your desired meal package (enter 0/1/2 corresponding to the options shown above:" );
		meal = keyboard.nextInt();}
		if ((meal > 2)||(meal < 0)) 
		{System.out.print("Your choice is invalid, please select a number that is between the range of 0-2");
		meal = keyboard.nextInt();}}



		//---------------------------------------------------------------------

		switch (room)  {
		case (1):
			switch (meal) {
			case (0):
				broomcost = (double) nights * 50.50; 
			pcost = (double)guests * broomcost;
			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 50.50 * nights - 50.50; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 50.50 * nights - 101.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break; 
			case (1):	
				broomcost = (double) nights * 50.50; 
			mealcost = guests * nights * 30;
			pcost = (double)guests * broomcost;
			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 50.50 * nights - 50.50; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 50.50 * nights - 101.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break; 
			case (2):
				broomcost = (double) nights * 50.50; 
			mealcost = guests * nights * 50;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 50.50 * nights - 50.50; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 50.50 * nights - 101.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			}
		break;
		case (2):
			switch (meal)
			{
			case (0):
				broomcost = (double) nights * 75.00; 
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 75.00 * nights - 75.00; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 75.00 * nights - 150.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (1):
				broomcost = (double) nights * 75.00; 
			mealcost = guests * nights * 30;
			pcost = (double)guests * broomcost;
			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 75.00 * nights - 75.00; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 75.00 * nights - 150.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (2):
				broomcost = (double) nights * 75.00; 
			mealcost = guests * nights * 50;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 75.00 * nights - 75.00; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 75.00 * nights - 150.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			}
		break;
		case (3): 
			switch (meal)
			{
			case (0):
				broomcost = (double) nights * 100.75; 
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 100.75 * nights - 100.75; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 100.75 * nights - 201.50;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (1):

				broomcost = (double) nights * 100.75; 
			mealcost = guests * nights * 30;
			pcost = (double)guests * broomcost;
			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 100.75 * nights - 100.75; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 100.75 * nights - 201.50;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;

			case (2):
				broomcost = (double) nights * 100.75; 
			mealcost = guests * nights * 50;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 100.75 * nights - 100.75; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 100.75 * nights - 201.50;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;

			}
		break;
		case (4):
			switch (meal)
			{

			case (0):
				broomcost = (double) nights * 150.25; 
			pcost = (double)guests * broomcost;
			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 150.25 * nights - 150.25; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 150.25 * nights - 300.50;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (1):

				broomcost = (double) nights * 150.25; 
			mealcost = guests * nights * 30;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 150.25 * nights - 150.25; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 150.25 * nights - 300.50;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (2):
				broomcost = (double) nights * 150.25; 
			mealcost = guests * nights * 50;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 150.25 * nights - 150.25; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 150.25 * nights - 300.50;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			}

		break;
		case (5):
			switch (meal)
			{
			case (0):
				broomcost = (double) nights * 225.50; 
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 225.50 * nights - 225.50; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 225.50 * nights - 451.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (1):
				broomcost = (double) nights * 225.50; 
			mealcost = guests * nights * 30;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 225.50 * nights - 225.50; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 225.50 * nights - 451.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (2):
				broomcost = (double) nights * 225.50; 
			mealcost = guests * nights * 50;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 225.50 * nights - 225.50; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 225.50 * nights - 451.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;
			case (3):
				broomcost = (double) nights * 225.50; 
			mealcost = guests * nights * 85;
			pcost = (double)guests * broomcost;

			if ((aaa == 1)&&(club == 1))
			{{aaa = (double) (pcost/ 10);
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("AAA Discount:\t   "+ "      -$"+aaa);

			if ((nights >= 4)||(nights <= 8)) 
			{clubd = 225.50 * nights - 225.50; 
			tcost = pcost - (aaa + clubd); 
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+ tcost );}

			else if ((nights >= 8)||(nights >= 10))
			{clubd = 225.50 * nights - 451.00;
			tcost = pcost - (clubd + aaa);
			System.out.println("Club Member Discount:    -$"+ clubd);
			System.out.println("Total Cost of Booking:    $"+tcost );}}}

			if ((aaa == 0) && (club == 0))
			{tcost = pcost;
			System.out.println("CHECKOUT");
			System.out.println("Room Cost:\t\t  $"+ broomcost);
			System.out.println("Meal Cost:\t\t"+ " +$"+ mealcost);
			System.out.println("Prelimary Total Cost:\t  $" + pcost);
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t  $" + tcost);}

			if ((aaa == 1)&&(club == 0)){
				aaa = (double) (pcost/ 10);
				tcost = pcost - aaa;
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);
				System.out.println("AAA Discount:\t   "+ "     -$"+aaa);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

			if ((club == 1)&&(aaa == 0))
			{
				System.out.println("CHECKOUT");
				System.out.println("Room Cost:\t\t"+ " $"+ broomcost);
				System.out.println("Meal Cost:\t\t"+ "+$"+ mealcost);
				System.out.println("Prelimary Total Cost:\t $" + pcost);

				if ((nights >= 4)||(nights <= 8)) 
				{clubd = 225.50 * nights - 225.50; 
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+ tcost );}

				else if ((nights >= 8)||(nights >= 10))
				{clubd = 225.50 * nights - 451.00;
				tcost = pcost - clubd;
				System.out.println("Club Member Discount:   -$"+ clubd);
				System.out.println("Total Cost of Booking:   $"+tcost );}}
			break;}
		break;







		}

	}
}

























