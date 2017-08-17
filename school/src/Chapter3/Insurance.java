package Chapter3;

import java.util.Scanner;

public class Insurance 
{
	 public static void main(String [] args)
	 {
		 Scanner keyboard = new Scanner(System.in);
		 
		 //Prompts the user for current year
		 System.out.println("What is the current year?");
		 int currentYear = keyboard.nextInt();
		 
		 //Prompts the user for birth year
		 System.out.println("What is your birth year?");
		 int birthYear = keyboard.nextInt();
		 keyboard.nextLine();
		 
		 //Calculates age by subtracting current year to birth year.
		 int age = currentYear - birthYear;
		 
		 System.out.println("The " +age+ " year old would have to pay $" +premium(currentYear, birthYear)+ ".");
		 
		 
	 }
	 
	 public static int premium(int currentYear, int birthYear)
	 {
		//Calculates age by subtracting current year to birth year.
		 int age = currentYear - birthYear;
		 //Calculates the decades by diving 10 by the age
		 int decade = age / 10;
		 
		 //Calculates the premium by adding 15 to decade and multiplying it by 20
		 int premium = (decade + 15) * 20;
		 
		 return premium;
	 }

}
