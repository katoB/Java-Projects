package Chapter4;

public class Circle 
{
	private double radius;
	private double diameter;
	private double area;
	
	public Circle()
	{
		this.radius = 1;
		this.diameter = radius / 2;
		this.area =  (Math.PI * radius * radius);
		
	}
	
	public void setRadius(int radius)
	{
		this.diameter = radius / 2;
		this.area = (Math.PI * radius * radius);
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}

	public void display()
	{
		System.out.println("The radius of the circe is " + getRadius() + ", diameter is " + this.diameter + ", area is " + this.area);
	}

}
