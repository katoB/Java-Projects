package Chapter3;

public class ArithmeticMethods 
{
	public static void main(String [] args)
	{
		int num1 = 8;
		int num2 = 3;
		
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
