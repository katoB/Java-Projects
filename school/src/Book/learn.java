package Book;

import java.util.Scanner;

public class learn
{
	public static void main(String [ ] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double price;
		double discount;
		double savings;
		
		System.out.println("Enter the cutoff price for the discount >>");
		price = keyboard.nextDouble();
		
		System.out.println("Enter discount rate as a whole number >>");
		discount = keyboard.nextDouble();
		
		savings = ComputedisplayInfo(price, discount);
		
		System.out.println("Special on this week on any service over " +price);
		System.out.println("Discount of " +discount+ " percent");
		System.out.println("That's a savings of atleast $ " +savings);
	
	}
	
	public static double ComputedisplayInfo(double pr, double discnt)
	{
		double savings = 100;
		savings = pr * discnt / 100;
		return savings;
	
	}
	
}

