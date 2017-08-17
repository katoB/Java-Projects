package Chapter3;

public class Painting 
{
	private String title;
	private String artist;
	private String medium;
	private double price;
	private double commission;
	final static double COMMISSION_RATE = 0.20; 
	
	public Painting()
	{
		title = "XXXX";
		artist = "XXXX";
		medium = "XXXX";
		price = 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		this.commission = price * COMMISSION_RATE;
	}

	public double getCommission() {
		
		return commission;
	}
	
	public static void displayCommission() {
		System.out.println("Commission rate: " + COMMISSION_RATE);
	}
	
	

}
