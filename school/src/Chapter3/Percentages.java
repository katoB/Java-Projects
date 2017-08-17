package Chapter3;

public class Percentages 
{
	public static void main(String [] args)
	{
		double num1 = 6;
		double num2 = 3;
		
		computePercent(num1, num2);
		
	}
	
	public static void computePercent(double num1, double num2)
	{
		double percentOF = num1 / num2;
		double percentage = percentOF * 100;
		
		System.out.println(num1+ " is " +percentage+ "% of "  +num2);
		
		double percentReverse = num2 / num1;
		double percentage1 = percentReverse * 100;
		
		System.out.println(num2+ " is " +percentage1+ "% of "  +num1);
		
	
		
		
	}
	
}
