package Chapter3;

public class Event 
{
	public final static int PRICE = 35;
	public final static int CUTOFF = 50;
	
	private String eventNum;
	private int guests;
	private int price;
	
	public Event()
	{
		eventNum = "Not set";
		guests = 0;
		price = 0;
	}
	
	public void setEventNumber(String eventNum)
	{
		this.eventNum = eventNum;
	}
	
	public void setGuests(int guests)
	{
		this.guests = guests;
		price = guests * PRICE;
		
	}
	
	public String eventNum()
	{
		return eventNum;
	}
	
	public int guests()
	{
		return guests;
	}
	
	public int price()
	{
		return price;
	}

}
