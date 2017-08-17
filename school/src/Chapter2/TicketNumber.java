package Chapter2;

import java.util.Scanner;

public class TicketNumber 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your ticket number");
		int ticketNumber = keyboard.nextInt();
		
		int removeLastDigit = ticketNumber / 10;
		
		int lastDigit = ticketNumber % 10;
		
		int remainderDigit = removeLastDigit % 7;
		
		if (remainderDigit == lastDigit)
		{
			System.out.println("This ticket is valid");
		} else 
		{
			System.out.println("This ticket is invalid.");
		}
		
		
	}

}
