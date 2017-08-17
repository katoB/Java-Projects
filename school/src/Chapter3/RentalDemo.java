package Chapter3;

import java.util.Scanner;

public class RentalDemo 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Rental bike = new Rental();
		
		String contractNum = SammysRentalPriceWithMethods.getContractNum();
		int time = SammysRentalPriceWithMethods.time();
		SammysRentalPriceWithMethods.motto();
		SammysRentalPriceWithMethods.compute(time);
		
	
	}

}
