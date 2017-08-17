package Chapter3;

import java.util.Scanner;

public class CarlysEventWithMethods 
{
	public static void main(String [] args)
	{
		
		motto();
		
		int guests = guests();
		
		calc(guests);
		
	}
	
	public static int guests()
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number_of_guests;
		
		System.out.println("How many people are attending the event?");
		number_of_guests = keyboard.nextInt();
		
		return number_of_guests;
	}
	
	public static String getEventNum()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the number of the event?");
		String eventNumber = keyboard.nextLine();
		
		return eventNumber;
	}
	
	public static void motto()
	{
		System.out.println("**************************************************");
		System.out.println("*                                                *");
		System.out.println("*  Carly's makes the food that makes it a party. *");
		System.out.println("*                                                *");
		System.out.println("**************************************************");
	}
	
	public static void calc(int guests)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int totalPrice;
		final int PRICE = 35;
		
		totalPrice = guests * PRICE;
		
		boolean largeEvent = (guests >= 50);
		System.out.println("Large event: " +largeEvent);
		
		System.out.println(guests+ " people are attending the event, which is $" +PRICE+ " per guest. So that will be a total of $"
				+totalPrice);
		
		
		
	}

}



