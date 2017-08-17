package Chapter2;

import java.util.Scanner;

public class CarlysEventPrice 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number_of_guests, totalPrice;
		final int PRICE = 35;
		
		System.out.println("**************************************************");
		System.out.println("*                                                *");
		System.out.println("*  Carly's makes the food that makes it a party. *");
		System.out.println("*                                                *");
		System.out.println("**************************************************");
		
		System.out.println("How many people are attending the event?");
		number_of_guests = keyboard.nextInt();
		
		totalPrice = number_of_guests * PRICE;
		
		System.out.println(number_of_guests+ " people are attending the event, which is $" +PRICE+ " per guest. So that will be a total of $"
				+totalPrice);
		
		boolean largeEvent = (number_of_guests >= 50);
		System.out.println("Large event: " +largeEvent);
		
	}

}
