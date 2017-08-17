package Chapter3;

public class TestSandwich 
{
	public static void main(String [] args)
	{
		Sandwich kato = new Sandwich();
		Sandwich stephanie = new Sandwich();
		
		kato.setMain("tuna");
		kato.setBreadType("wheat");
		kato.setPrice(10.99);
		
		stephanie.setMain("turkey");
		stephanie.setBreadType("rye");
		stephanie.setPrice(2.99);
		
		
		System.out.println("Kato got a sandwhich which had a main ingredient of " +kato.getMain()+ ", bread type of " +kato.getBreadType()+
							" and the total price if $" +kato.getPrice() );
		
		System.out.println("Stephanie got a sandwhich which had a main ingredient of " +stephanie.getMain()+ ", bread type of " +stephanie.getBreadType()+
							" and the total price if $" +stephanie.getPrice());
	}

}
