package Chapter2;

import java.util.Scanner;
public class DogBoarding 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		final double COST_PER_DAY_POUND = 0.50d;
		double totalPrice;
		double weight;
		int days;
		double weightPrice;
		double dayPrice;
		
		System.out.println("Thank you for boarding The Happy Yappy Kennel."
							+ " What is the weight of your dog? Enter weight below >> ");
		weight = input.nextDouble();
		
		System.out.println("How many days will you be boarded? ");
		days = input.nextInt();
		
		weightPrice = weight * COST_PER_DAY_POUND;
		dayPrice = days * COST_PER_DAY_POUND;
		
		totalPrice = weightPrice + dayPrice;
		
		System.out.println("Your dog weighs " +weight+ " lbs, and you plan on boarding for " +days+ 
							" days. Total price will come up to $" +totalPrice);
		
		
	}

}
