package Chapter3;

import java.util.Scanner;

public class SammysRentalPriceWithMethods 
{
	public static void main(String [] args)
	{
		motto();
		int mins = time();
		compute(mins);
	}
	
	public static int time()
	{
		Scanner keyboard = new Scanner(System.in);
		int mins;
		
		System.out.println("How many minutes was the sport equipment rented?");
		mins = keyboard.nextInt();
		
		return mins;
	}
	
	public static String getContractNum()
	{
		Scanner keyboard = new Scanner(System.in);
		
		String num;
		System.out.println("What is the Contract Number?");
		num = keyboard.nextLine();
		
		return num;
	}
	
	public static void motto()
	{
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                      S");
		System.out.println("S   Sammy's makes it fun in the sun.   S");
		System.out.println("S                                      S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	}
	
	public static void compute(int mins)
	{
		double totalPrice = mins - 60 * 1 + 40;
		
		
		
		if (mins >= 60){
			int hour = (int) mins / 60;
			int minutes = (int) mins - 60;
			System.out.println("You rented them equipment for " +mins+ " minutes. That is " +hour+ " hour, and " +minutes+ 
					" minutes. The total price is $" +totalPrice+ ". ");	
		}else if (mins <= 59) {
			int minutes = (int) mins;
			System.out.println("You rented them equipment for " +mins+ " minutes. That is " +minutes+ 
					" minutes. The total price is $" +totalPrice+ ". ");
		}
		
	}
		
}
