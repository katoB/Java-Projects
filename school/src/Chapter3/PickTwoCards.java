package Chapter3;

public class PickTwoCards 
{
	public static void main(String [] arg)
	{
		final int CARDS_IN_SUIT = 13;
		
		int myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		
		System.out.println(myValue);
	}

}
