package Chapter4;



public class FormLetterWriter 
{
	public void displaySalutation(String lastName)
	{
		System.out.println("Dear Mr. or Mrs. " + lastName);
		System.out.println("Thank you for your recent order.");
	}
	
	public void displaySalutation(String firstName, String lastName)
	{
		System.out.println("Dear " + firstName + " " + lastName);
		System.out.println("Thank you for your recent order.");
	}
	
	public static void main(String [] args)
	{
		FormLetterWriter person1 = new FormLetterWriter();
		
		person1.displaySalutation("Byantalo");
		person1.displaySalutation("Kato", "Byantalo");
		
	}

}
