package Chapter4;

public class Bread 
{
	private String breadType;
	private int calPerSlice;
	public final static String MOTTO = "The staff of life";
	
	public Bread(String breadType, int calPerSlice)
	{
		this.breadType = breadType;
		this.calPerSlice = calPerSlice;
	}
	
	public String getBreadType()
	{
		return this.breadType;
	}
	
	public int getCalPerSlice()
	{
		return this.calPerSlice;
	}
	
	public void  display()
	{
		System.out.println("Bread type is: " + getBreadType() + ", calories per slice is: " + getCalPerSlice());
		System.out.println(MOTTO);
	}

}
