package Chapter4;

public class TestCircle 
{
	public static void main(String [] args)
	{
		Circle tire = new Circle();
		Circle ball = new Circle();
		Circle circle = new Circle();
		
		tire.setRadius(10);
		tire.display();
		
		ball.setRadius(154);
		ball.display();
		
		circle.display();
	}

}
