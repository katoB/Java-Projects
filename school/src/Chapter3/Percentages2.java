package Chapter3;

import java.util.Scanner;

public class Percentages2 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Pick you first number");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Pick your second number");
		double num2 = keyboard.nextDouble();
		keyboard.nextLine();
		
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
