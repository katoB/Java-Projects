package Chapter2;

public class ProjectedSales 
{
	public static void main(String [] args)
	{
		final double NEXTYEAR_SALESINCREASE = 0.10d;
		double northDivision = 2300d;
		double southDivision = 4900d;
		
		double projected_northDivision = northDivision * NEXTYEAR_SALESINCREASE;
		projected_northDivision = projected_northDivision + northDivision;
		
		double projected_southDivision = southDivision * NEXTYEAR_SALESINCREASE;
		projected_southDivision = projected_southDivision + southDivision;
		
		System.out.println("Next year's projected sales for the north division is $" +projected_northDivision);
		System.out.println("Next year's projected sales for the north division is $" +projected_southDivision);
		
	}

}
