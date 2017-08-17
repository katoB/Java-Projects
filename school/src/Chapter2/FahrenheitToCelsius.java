package Chapter2;

import java.util.Scanner;
public class FahrenheitToCelsius 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter temperature in fahrenheit...");
		int fahrenheit = keyboard.nextInt();
		
		int celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("The temperature you picked in fahrenheit was " +fahrenheit+ " degrees. Converting to celsius would be " 
							+celsius+ " degrees.");
	}

}
