package Chapter2;

import java.util.Scanner;
public class MadLib 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Name something you can use to write");
		String write = keyboard.nextLine();
		
		System.out.println("Name a color");
		String color = keyboard.nextLine();
		
		System.out.println("Name something you wear.");
		String wear = keyboard.nextLine();
		
		System.out.println("Describe your personality");
		String personality = keyboard.nextLine();
		
		System.out.println("Using a " +write+ " the girl drew so well.\nThe color " +color+ " made the drawing look swell.\n"
							+ "She had on a " +wear+ " which she liked to wear\nShe had a " +personality+ " personality that people cared.");
		
	}

}
