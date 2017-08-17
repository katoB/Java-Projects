package Chapter3;

public class Student 
{
	private int ID;
	private double creditHours;
	private int pointsEarned;
	private float GPA;
	
	public void setID(int num)
	{
		ID = num;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void setCreditHours(int hours)
	{
		creditHours = hours;
	}
	
	public double getCreditHours()
	{
		return creditHours;
	}
	
	public void setPointEarned(int points)
	{
		pointsEarned = points;
	}
	
	public int getPointsEarned()
	{
		return pointsEarned;
	}
	
	public float getGpa()
	{
		float GPA = (float) (pointsEarned / creditHours);
		
		return GPA;
	}
	
	public void display()
	{
		System.out.println("Student ID " + ID);
		System.out.println("Credit Hours " + creditHours);
		System.out.println("Points Earned " + pointsEarned);
		System.out.println("GPA: " + getGpa());
	}

}
