package Chapter3;

import java.util.Scanner;

public class MetricConversion 
{
	public static void main(String [] main)
	{
		// User input
		Scanner keyboard = new Scanner(System.in);
		
		//Prompting user to enter a number
		System.out.println("Enter a number>>");
		int num = keyboard.nextInt();
		
		// 2.54 centimeters in an inch
		final double CENTI_IN_INCH = 2.54;
		// 3.7854 liters in a U.S gallon
		final double LIT_IN_GAL = 3.7854;
		
		inchesToCenti(num);
		galToLiters(num);
		
	}
	
	public static void inchesToCenti(int num)
	{
		// 2.54 centimeters in an inch
		final double CENTI_IN_INCH = 2.54;
		
		double cm = num * CENTI_IN_INCH;
		System.out.println("There is " +cm+ "cm in " +num+ " inches");
		
	}
	
	public static void galToLiters(int num)
	{
		// 3.7854 liters in a U.S gallon
		final double LIT_IN_GAL = 3.7854;
		
		double lit = num * LIT_IN_GAL;
		System.out.println("There is " +lit+ " liters in " +num+ " gallons");
	}

}
