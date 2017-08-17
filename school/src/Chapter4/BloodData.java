package Chapter4;

public class BloodData 
{
	private char bloodType;
	private char RHfactor;
	
	public BloodData()
	{
		this.bloodType = 'O';
		this.RHfactor = '+';
	}
	
	public BloodData(char bloodType, char RHfactor)
	{
		this.bloodType = bloodType;
		this.RHfactor = RHfactor;
	}
	
	public void setBloodType(char bloodType)
	{
		this.bloodType = bloodType;
	}
	
	public void setRHfactor(char RHfactor)
	{
		this.RHfactor = RHfactor;
	}
	
	public char getBloodType()
	{
		return this.bloodType;
	}
	
	public char getRHfactor()
	{
		return this.RHfactor;
	}
	
	public void display()
	{
		System.out.println("Blood type is: " + getBloodType() + ", RH factor is: " + getRHfactor());
	}

}
