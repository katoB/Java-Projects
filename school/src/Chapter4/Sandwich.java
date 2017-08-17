package Chapter4;

public class Sandwich 
{
	private Bread bread;
	private SandwichFilling sandwichFilling;
	private int totalCalories;
	
	public Sandwich(String breadType, int calPerSlice, String fillingType, int calPerServing )
	{
		this.bread = new Bread(breadType, calPerSlice);
		this.sandwichFilling = new SandwichFilling(fillingType, calPerServing);
		this.totalCalories = (calPerSlice * 2) + calPerServing;
	}
	
	public Bread getBread()
	{
		return this.bread;
	}
	
	public SandwichFilling getSandwichFilling()
	{
		return this.sandwichFilling;
	}
	
	public int getTotalCalories()
	{
		return this.totalCalories;
	}
	
	public void display()
	{
		bread.display();
		sandwichFilling.display();
		System.out.println("Sandwich total calories: " + getTotalCalories() );
	}

}
