package Chapter2;

import java.util.Scanner;

public class RandomGuessMatch 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Have user input a number
		System.out.println("Pick a number from 1 to 5");
		int guess = keyboard.nextInt();
		
		//If number not between 1 and 5
		if (guess > 5){
			System.out.println("Number not between 1 and 5. Try again.");
			keyboard.next();
		}
		
		//Initializing random variable
		int random = (int) (Math.random() * 6);
		System.out.println("The number was " +  (random = (int) (Math.random() * 6)));
		
		
		//Using if statement for determining how off the user was with their guess
		int difference = random - guess;
		int difference1 = guess - random;
		if (random > guess)
		{
			System.out.println("You were off by just " +difference);
		} if (random < guess) {
			System.out.println("You were off by just " +difference1);
		}
		
		
		
		//determining if user's guess was true or false
		boolean rightOrWrong = (random == guess);
		System.out.println(rightOrWrong);
	
		
	}

}
