package Chapter3;

import java.util.Scanner;

public class TestPainting 
{
	public static void main(String [] args)
	{
		Painting painting1 = new Painting();
		Painting painting2 = new Painting();
		Painting painting3 = new Painting();
		
		
		
		painting1 = paintings(painting1);
		painting2 = paintings(painting2);
		
		System.out.println("Painting 1 name: " +painting1.getTitle()+ ", Artist name: " +painting1.getArtist()+ ", Medium color: " +painting1.getMedium()+
							", Price: " +painting1.getPrice()+ " " + painting1.getCommission());
		
		System.out.println("Painting 2 name: " +painting2.getTitle()+ ", Artist name: " +painting2.getArtist()+ ", Medium color: " +painting2.getMedium()+
							", Price: " +painting2.getPrice() + " " + painting2.getCommission());
		
		System.out.println("Painting 3 name: " +painting3.getTitle()+ ", Artist name: " +painting3.getArtist()+ ", Medium color: " +painting3.getMedium()+
							", Price: " +painting3.getPrice());
		
		painting1.displayCommission();
	}
	
	public static Painting paintings(Painting p)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String title;
		String artist;
		String medium;
		double price;
		
		System.out.println("painting title?");
		title = keyboard.nextLine();
		
		System.out.println("artist name?");
		artist = keyboard.nextLine();
		
		System.out.println("Whats the medium? (water color)");
		medium = keyboard.nextLine();
		
		System.out.println("How much is it?");
		price = keyboard.nextDouble();
		keyboard.nextLine();
		
		p.setTitle(title);
		p.setArtist(artist);
		p.setMedium(medium);
		p.setPrice(price);
		
		return p;
	}

}
