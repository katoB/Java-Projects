package Chapter4;

public class TestBread 
{
	public static void main(String [] args)
	{
		Bread bread1 = new Bread("Wheat", 200);
		Bread bread2 = new Bread("Rye", 100);
		Bread bread3 = new Bread("White", 150);
		
		bread1.display();
		bread2.display();
		bread3.display();
	}

}
