package Chapter3;

import java.util.Scanner;

public class GasPrices 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the price per barrel");
		int pricePerBarrel = keyboard.nextInt();
		
		rangeOfGallons(pricePerBarrel);
		
		
	}
	
	public static void rangeOfGallons(int pricePerBarrel)
	{
		float pumpPrice = (float) (pricePerBarrel / 28.5);
		float pumpPrice1 = (float)pricePerBarrel / 25;
		
		System.out.println("You chose $" +pricePerBarrel+ " per barrel, which means the price at the pump would be between $" +pumpPrice+ " and $" +pumpPrice1);
	}

}
