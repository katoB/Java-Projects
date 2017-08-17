package Book;

public class spaService 
{
	private String serviceDescription;
	private double price;
	
	public spaService()
	{
		serviceDescription = "XXX";
		price = 0;
	}
	
	
	public void setServiceDescription(String service)
	{
		serviceDescription = service;
	}
	
	public String getServiceDescription()
	{
		return serviceDescription;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	

}
