package Chapter2;

import java.util.Scanner;

public class ProjectedSalesInteractive 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		final double NEXTYEAR_SALESINCREASE = 0.10d;
		double northDivision;
		double southDivision;
		
		System.out.println("Enter the current year sales for the North Divison >>");
		northDivision = input.nextDouble();
		
		System.out.println("Enter the current year sales for the South Divison >>");
		southDivision = input.nextDouble();
		
		double projected_northDivision = northDivision * NEXTYEAR_SALESINCREASE;
		projected_northDivision = projected_northDivision + northDivision;
		
		double projected_southDivision = southDivision * NEXTYEAR_SALESINCREASE;
		projected_southDivision = projected_southDivision + southDivision;
		
		System.out.println("Next year's projected sales for the north division is $" +projected_northDivision);
		System.out.println("Next year's projected sales for the north division is $" +projected_southDivision);
	}

}
