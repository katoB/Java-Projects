package Chapter4;

import java.util.*;

public class YearEnd 
{
	public static void main(String [] args)
	{
		GregorianCalendar now = new GregorianCalendar();
		
		int today = now.get(GregorianCalendar.DAY_OF_YEAR);
		final int DAYS_IN_YEAR = 365;
		
		int tilEndOfYear = DAYS_IN_YEAR - today + 1;
		
		System.out.println(tilEndOfYear);
	}

}
