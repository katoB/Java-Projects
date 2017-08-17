package Chapter2;

public class MilesToFeet 
{
	public static void main(String [] args)
	{
		final float FEET_IN_A_MILE = 5280F;
		float distanceToUncle = 23;
		float milesToFeet = FEET_IN_A_MILE * distanceToUncle;
		
		System.out.println("The distance from my house to my uncle's house is " +distanceToUncle+ " miles or " +milesToFeet+
							" feet.");
		
		
	}

}
