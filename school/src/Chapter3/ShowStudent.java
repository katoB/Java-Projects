package Chapter3;

public class ShowStudent 
{
	public static void main(String [] args)
	{
		ShowStudent2 kato = new ShowStudent2();
		
		System.out.println("Student ID " + kato.getID());
		System.out.println("Credit Hours " + kato.getCreditHours());
		System.out.println("Points Earned " + kato.getPointsEarned());
		System.out.println("GPA: " + kato.getGpa());
		
		
	}

}
