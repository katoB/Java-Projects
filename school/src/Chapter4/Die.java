package Chapter4;

public class Die 
{
	private static int lowest_die_value = 1;
	private static int highest_die_value = 6;
	private int randomValue;
	
	public Die()
	{
		randomValue = ((int) (Math.random() * 100) % highest_die_value + lowest_die_value);
	}
	
	public int getRandomValue()
	{
		return this.randomValue;
	}
	
	public void display()
	{
		System.out.println(randomValue);
	}

}
