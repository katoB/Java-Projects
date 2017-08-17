package Chapter3;

import java.util.Scanner;

public class Salary 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Prompts user for the hourly rate
		System.out.println("What is the hourly rate?");
		int hourlyRate = keyboard.nextInt();
		
		System.out.println("How many hours did you work?");
		int hours = keyboard.nextInt();
		
		System.out.println("How many overtime hours did you work?");
		int overtime = keyboard.nextInt();
		
		overtimePay(overtime, hours, hourlyRate);
		
		System.out.println("You worked " +hours+ " hours, at an hourly rate of $" +hourlyRate+ " an hour. " +
							"You also worked " +overtime+ " overtime hours which bring your weekly salary up to $" +overtimePay(overtime, hours, hourlyRate));
	}
	
	public static float overtimePay(int overtime, int hours, int hourlyRate)
	{
		float pay = (float) ((hours * hourlyRate) + (overtime * 1.5) * hourlyRate);
		
		return pay;
	}

}
