package Chapter4;

public class SandwichFilling 
{
	private String fillingType;
	private int calPerServing;
	
	public SandwichFilling(String fillingType, int calPerServing)
	{
		this.fillingType = fillingType;
		this.calPerServing = calPerServing;
		
	}
	
	public String getFillingType()
	{
		return this.fillingType;
	}
	
	public int getCalPerServing()
	{
		return this.calPerServing;
	}
	
	public void display()
	{
		System.out.println("Sandwich filling: " + getFillingType() + ", Calories per serving: " + getCalPerServing());
	}

}
