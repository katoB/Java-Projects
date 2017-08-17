package Chapter3;

import java.util.Scanner;

public class PaintCalculator 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length of the room? >>");
		int length = keyboard.nextInt();
		
		System.out.println("What is the width of the room? >>");
		int width = keyboard.nextInt();
		
		System.out.println("What is the height of the room? >>");
		int height = keyboard.nextInt();
		
		
		System.out.println("The cost to paint a " +length+ "-by-" +width+  "-foot room with a " +height+ " foot ceilings is $" +room(length, width));
	}
	
	public static int room(int length, int width)
	{
		//wall area for the room
		int area = length * width;
		
		System.out.println(paint(area)+ " gallons of paint is needed");
		
		int price = (int) (paint(area) * 32.0);
		
		return price;
		
	}
	
	public static int paint(int area)
	{
		int gallons = 0;
		
		if (area > 350){
			gallons =  area / 350;
		} else if (area < 350){
			gallons = (350 / area);
		}
		return gallons;
	}

}
