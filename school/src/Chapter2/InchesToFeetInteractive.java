package Chapter2;

import java.util.Scanner;

public class InchesToFeetInteractive 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		double inches;
		
		System.out.println("Enter how many inches you want to convert...");
		inches = input.nextDouble();
		
		final double INCHES_IN_1_FOOT = 12;
		int resultFeet = (int) (inches / INCHES_IN_1_FOOT);
		double resultInches = inches % INCHES_IN_1_FOOT;

		
		System.out.println(inches+ " inches in feet is " +resultFeet+ " feet and " +resultInches+ " inches");
	}

}
