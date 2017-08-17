package Chapter4;

public class FiveDice 
{
	private static int lowest_die_value = 1;
	private static int highest_die_value = 6;
	private int randomValue;
	
	public FiveDice()
	{
		randomValue = ((int) (Math.random() * 100) % highest_die_value + lowest_die_value);
	}
	
	public void generate()
	{
		randomValue = ((int) (Math.random() * 100) % highest_die_value + lowest_die_value);
	}
	
	public int getRandomValue()
	{
		generate();
		return this.randomValue;
	}
	
	public void thrown()
	{
		System.out.println("Lets start rolling...");
		System.out.println("Roll 1 :" + getRandomValue());
		System.out.println("Roll 2 :" + getRandomValue());
		System.out.println("Roll 3 :" + getRandomValue());
		System.out.println("Roll 4 :" + getRandomValue());
		System.out.println("Roll 5 :" + getRandomValue());
		
		
	}

}
