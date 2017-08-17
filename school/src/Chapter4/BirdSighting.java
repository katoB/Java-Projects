package Chapter4;

import java.util.*;

public class BirdSighting 
{
	private String species;
	private int birdsSeen;
	private int dayOfYear;
	
	public BirdSighting(String species, int birdsSeen, int dayOfYear)
	{
		this.species = species;
		this.birdsSeen = birdsSeen;
		this.dayOfYear = GregorianCalendar.DAY_OF_YEAR;
	}
	public BirdSighting()
	{
		species = "Robin";
		birdsSeen = 1;
		dayOfYear = 1;
	}
	
	public String getSpecies()
	{
		return species;
	}
	
	public int getBirdsSeen()
	{
		return birdsSeen;
	}
	
	public int getDayOfYear()
	{
		return dayOfYear;
	}
	
	public void sightings()
	{
		System.out.println("Species seen: " + getSpecies() + ", Birds seen: " + getBirdsSeen() + ", day of the year: " + getDayOfYear());

	}
	

}
