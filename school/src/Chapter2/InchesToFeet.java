package Chapter2;

public class InchesToFeet 
{
	public static void main(String [] args)
	{
		double inches = 123;
		final double INCHES_IN_1_FOOT = 12;
		int resultFeet = (int) (inches / INCHES_IN_1_FOOT);
		double resultInches = inches % INCHES_IN_1_FOOT;
		
		System.out.println(inches+ " inches in feet is " +resultFeet+ " feet and " +resultInches+ " inches");
	}

}
