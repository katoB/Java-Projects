package Chapter4;

import java.util.*;

public class BirdSighting2 
{
	private String species;
	private int birdsSeen;
	private int dayOfYear;
	
	public BirdSighting2(String species, int birdsSeen, int dayOfYear)
	{
		this.species = species;
		this.birdsSeen = birdsSeen;
		this.dayOfYear = dayOfYear;
	}
	public BirdSighting2()
	{
		this("robin", 1, 1);
	}
	
	
	public String getSpecies()
	{
		return this.species;
	}
	
	public int getBirdsSeen()
	{
		return this.birdsSeen;
	}
	
	public int getDayOfYear()
	{
		return this.dayOfYear;
	}
	
	public void sightings()
	{
		System.out.println("Species seen: " + getSpecies() + ", Birds seen: " + getBirdsSeen() + ", day of the year: " + getDayOfYear());

	}
	

}
