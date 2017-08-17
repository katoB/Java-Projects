package Chapter3;

public class CardTester 
{
	public static void main(String [] args)
	{
		
		
		final int CARDS_IN_SUIT = 13;
		
		int myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

		Card c1 = new Card();
		c1.setSuit('s');
		c1.setValue(myValue);
		
		Card c2 = new Card();
		c2.setSuit('h');
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		c2.setValue(myValue);
		
		System.out.println("C1 = " + c1.toString());
		System.out.println("C2 = " + c2.toString());

		
	}
}
