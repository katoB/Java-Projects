package Chapter2;

import java.util.Scanner;

public class Eggs 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int DOZEN_EGGS = 12;
		final double DOZEN_EGGS_PRICE = 3.25D;
		final double INDIVIDUAL_EGGS_PRICE = 0.45;
		int dozenEggsPicked;
		int dozenEggsTotal;
		int indiviEggsPicked;
		double dozenEggsPrice;
		double indiviEggsPrice;
		
		System.out.println("How many dozen egss would you like? Enter below...");
		dozenEggsPicked = input.nextInt();
		
		dozenEggsTotal = dozenEggsPicked * DOZEN_EGGS;
		dozenEggsPrice = DOZEN_EGGS_PRICE * dozenEggsPicked;
		
		System.out.println("How many individual eggs do you want?");
		indiviEggsPicked = input.nextInt();
		
		indiviEggsPrice = indiviEggsPicked * INDIVIDUAL_EGGS_PRICE;
		
		int totalEggs =  dozenEggsTotal + indiviEggsPicked;
		double totalEggsPrice = indiviEggsPrice + dozenEggsPrice;
		
		System.out.println("You chose " +dozenEggsPicked+ " dozen eggs, which ends up being a total of " 
							+dozenEggsTotal+ " eggs. The price will be $" +dozenEggsPrice+ ". You chose " 
							+indiviEggsPicked+ " individual eggs. That'll be " +INDIVIDUAL_EGGS_PRICE+ " each. For a total of $"
							+indiviEggsPrice+ ". You have a total eggs of " +totalEggs+ ", the total amount will be $"
							+totalEggsPrice+ ".");
		
		
		
	}

}
