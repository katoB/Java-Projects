package Chapter3;

public class Rental 
{
	public final static int MINS_IN_HR = 60;
	public final static int HOURLY_RATE = 40;
	
	private String contractNum;
	private int hours;
	private int mins;
	private double price;
	
	public void setContractNum(String num)
	{
		contractNum = num;
	}
	
	public void setHoursAndMinutes(int mins)
	{
		double totalPrice = mins - 60 * 1 + 40;
		
		if (mins >= 60){
			int hour = (int) mins / 60;
			int minutes = (int) mins - 60;
			System.out.println("You rented them equipment for " +mins+ " minutes. That is " +hour+ " hour, and " +minutes+ 
					" minutes. The total price is $" +totalPrice+ ". ");	
		}else if (mins <= 59) {
			int minutes = (int) mins;
			System.out.println("You rented them equipment for " +mins+ " minutes. That is " +minutes+ 
					" minutes. The total price is $" +totalPrice+ ". ");
		}
	}

	public String getContractNum() {
		return contractNum;
	}

	public int getHours() {
		return hours;
	}

	public int getMins() {
		return mins;
	}

	public double getPrice() {
		return price;
	}
	
	

}
