package Chapter3;

import java.util.Scanner;

public class ArithmeticMethod2 
{
	public static void main(String [] args)
	{
		// instantiating object
		Scanner keyboard = new Scanner(System.in);
		
		//prompting user input
		System.out.println("Enter first number");
		int num1 = keyboard.nextInt();
		System.out.println("Enter second number");
		int num2 = keyboard.nextInt();
		keyboard.nextLine();
		
		//passing variable through method
		displayNumberPlus10(num1, num2);
		displayNumberPlus100(num1, num2);
		displayNumberPlus1000(num1, num2);
	}
	
	public static void displayNumberPlus10(int num1, int num2)
	{
		int calcu = num1 + 10;
		System.out.println(num1 + " + 10 is " +calcu);
		
		int calcu1 = num2 + 10;
		System.out.println(num2 + " + 10 is " +calcu1);
		
	}
	
	public static void displayNumberPlus100(int num1, int num2)
	{
		int calcu2 = num1 + 100;
		System.out.println(num1 + " + 100 is " +calcu2);
		
		int calcu3 = num2 + 100;
		System.out.println(num2 + " + 100 is " +calcu3);
	}
	
	public static void displayNumberPlus1000(int num1, int num2)
	{
		int calcu4 = num1 + 1000;
		System.out.println(num1 + " + 1000 is " +calcu4);
		
		int calcu5 = num2 + 1000;
		System.out.println(num2 + " + 1000 is " +calcu5);
	}
}
