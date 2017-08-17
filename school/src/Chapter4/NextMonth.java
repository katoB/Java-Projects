package Chapter4;

import java.util.*;

public class NextMonth 
{
	public static void main(String [] args)
	{
		GregorianCalendar now = new GregorianCalendar();
		
		int today = now.get(GregorianCalendar.DAY_OF_MONTH);
		final int MONTHS_IN_AUGUST = 31;
		
		int tilFirstDay = MONTHS_IN_AUGUST - today + 1 ;
		
		System.out.println(tilFirstDay);
	}

}
