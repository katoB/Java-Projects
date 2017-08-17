package Chapter4;

public class TestSandwich 
{
	public static void main(String [] args)
	{
		Sandwich sandwich1 = new Sandwich("White", 79, "Egg salad", 250);
		Sandwich sandwich2 = new Sandwich("Rye", 58, "Chicken", 200);
		Sandwich sandwich3 = new Sandwich("Wheat", 67, "Bacon", 300);
		sandwich1.display();
		sandwich2.display();
		sandwich3.display();
		
		
	}

}
