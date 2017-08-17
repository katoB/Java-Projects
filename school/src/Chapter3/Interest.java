package Chapter3;

import java.util.Scanner;

public class Interest 
{
	public static void main(String [] args)
	{
		
		startingValue();
		
		
	}		
	
	public static void startingValue()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the starting value of your investment?");
		int kato = keyboard.nextInt();
		
		calculation(kato);
		
		System.out.println("With the starting value of $" +kato+ ", if you invested your money at 5 percent interest for one year you would have $"
							+ calculation(kato));
	}
	
	public static float calculation(int startValue)
	{
		float aYear = (float) (startValue * .05);
		float amount = startValue + aYear;
		
		return amount;
		
		
	}

}
