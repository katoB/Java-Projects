package Chapter3;

import java.util.Scanner;

public class EventDemo 
{
	public static void main(String [] args)
	{
		//Main method should declare an Event object
		Event event = new Event();
		
		String eventNumber = CarlysEventWithMethods.getEventNum();
		int guests = CarlysEventWithMethods.guests();
		CarlysEventWithMethods.motto();
		CarlysEventWithMethods.calc(guests);
		
		event.setEventNumber(eventNumber);
		event.setGuests(guests);
		
		System.out.println("Event number: " + event.eventNum() + "\nNumber of guests: " + event.guests());
		
	}

}
