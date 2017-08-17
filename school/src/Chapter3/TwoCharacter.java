package Chapter3;


public class TwoCharacter 
{
	public static void main(String [] arg)
	{
		
		MyCharacter character1 = new MyCharacter();
		MyCharacter character2 = new MyCharacter();
		
		
		character1.setArms(2);
		character1.setLegs(2);
		character1.setLives(1);
		System.out.println("Character 1 attributes:");
		display(character1);
		
		
		
		character2.setArms(1);
		character2.setLegs(1);
		character2.setLives(2);
		System.out.println("Character 2 attributes:");
		display(character2);
	}
	
	public static void display(MyCharacter mc)
	{
		System.out.println("arms: " + mc.getArms());
		System.out.println("legs: " + mc.getLegs());
		System.out.println("lives: " + mc.getLives());

	}
	
	

}
