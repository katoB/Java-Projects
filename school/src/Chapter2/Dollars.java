package Chapter2;

import java.util.Scanner;
public class Dollars 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a dollar amount");
		int dollarAmount = input.nextInt();
		
		int twenties = dollarAmount/20;
		int tens = (dollarAmount - 20*twenties) / 10;
		int fives = (dollarAmount - (20*twenties + 10*tens)) / 5;
		int ones = (dollarAmount - (20*twenties + 10*tens + 5*fives));
		
		System.out.println("That is " + twenties + " twenties, " + tens + " tens, " + fives + " fives, and " + ones + " ones.");
	}

}
