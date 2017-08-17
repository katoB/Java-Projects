package Chapter2;

import java.util.Scanner;

public class SammysRentalPrice 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int minutesRented;
		int rentalCost = 40;
		int additionalMin = 1;
		int hour, minutes;
		
		System.out.println("How many minutes was the sport equipment rented?");
		minutesRented = keyboard.nextInt();
		
		double totalPrice = minutesRented - 60 * 1 + 40;
		
		hour = (int) minutesRented / 60;
		minutes = (int) minutesRented - 60;
		
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                      S");
		System.out.println("S   Sammy's makes it fun in the sun.   S");
		System.out.println("S                                      S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
		
		System.out.println("You rented them equipment for " +minutesRented+ " minutes. That is " +hour+ " hour, and " +minutes+ 
				" minutes. The total price is $" +totalPrice+ ". ");
		
		
	}

}
