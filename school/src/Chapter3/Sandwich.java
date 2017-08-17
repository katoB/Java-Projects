package Chapter3;

public class Sandwich 
{
	private String main;
	private String breadType;
	private double price;
	
	public void setMain(String ingredient)
	{
		main = ingredient;
	}
	
	public String getMain()
	{
		return main;
	}
	
	public void setBreadType(String bread)
	{
		breadType = bread;
	}
	
	public String getBreadType()
	{
		return breadType;
	}
	
	public void setPrice(double cost)
	{
		price = cost;
	}
	
	public double getPrice()
	{
		return price;
	}
	

}
