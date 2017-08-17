package Chapter4;

public class State 
{
	private String state;
	private int population;
	private int capCity;
	private String popCity;
	private City city;
	
	public State(String state, int population, int capCity, String popCity, String gaCity, int cityPop)
	{
		this.city = new City(gaCity, cityPop);
		this.state = state;
		this.population = population;
		this.capCity =  capCity;
		this.popCity = popCity;
		
	}
	
	public void display()
	{
		System.out.println("State name: " + getState()  + ", Population: " + getPopulation());
		System.out.println("Georgia's most populated city: " + getPopCity() + ", with " + getCapCity());
		System.out.println("City in Georgia: " + city.gaCity + " with " + city.cityPop);
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getPopulation()
	{
		return population;
	}
	
	public int getCapCity()
	{
		return capCity;
	}
	
	public String getPopCity()
	{
		return popCity;
	}
	
	private class City
	{
		private String gaCity;
		private int cityPop;
		
		public City(String gaCity, int cityPop)
		{
			this.gaCity = gaCity;
			this.cityPop = cityPop;
		}
	}
	
	

}
