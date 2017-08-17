package snippet;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Student 
{
	public static void main(String [] args)
	{
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number...");
		firstNumber = input.nextInt();
		System.out.println("Enter your second number...");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		
		average = (double) (sum / 2);
		System.out.println("The average is " +average);
		
		
	}
	
}
