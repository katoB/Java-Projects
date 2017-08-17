package Chapter4;

public class Patient 
{
	private int ID;
	private int age;
	private BloodData bloodData;
	
	public Patient(char bloodType, char RHfactor)
	{
		this.ID = 0;
		this.age = 0;
		this.bloodData = new BloodData(bloodType, RHfactor);
		
	}
	
	public Patient(int ID, int age, char bloodType, char RHfactor)
	{
		this.ID = ID;
		this.age = age;
		this.bloodData = new BloodData(bloodType, RHfactor);
	}
	
	public int getID()
	{
		return this.ID;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public BloodData getBloodData()
	{
		return this.bloodData;
	}
	
	public void display()
	{
		
		System.out.println("Patient's ID is: " + getID() + ", age is: " + getAge() + ", blood data is: " + bloodData.getBloodType() + " and " + bloodData.getRHfactor());
	}

}
