package Chapter3;

public class Card 
{
	private char suit;
	private int value;
	
	//Default Constructors
	public Card()
	{
		suit = 'X';
		value = 0;
	}
	
	//Constructors
	public Card(int value, char suit)
	{
		this.value = value;
		this.suit = suit;
	}
	
	public void setSuit(char suit)
	{
		this.suit = suit;
	}
	
	public char getSuit()
	{
		return suit;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String toString()
	{
		return value + " of " + suit;
	}
}
