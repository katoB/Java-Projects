package Chapter2;

import java.util.Scanner;
public class MilesToFeetIneractive 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		final float FEET_IN_A_MILE = 5280F;
		float distanceToUncle;
		
		
		System.out.println("What is the distance from your house to your uncle's house in miles? ");
		distanceToUncle = input.nextFloat();
		
		float milesToFeet = FEET_IN_A_MILE * distanceToUncle;
		
		System.out.println("The distance from my house to my uncle's house is " +distanceToUncle+ " miles or " +milesToFeet+
				" feet.");
		
		
	}

}
