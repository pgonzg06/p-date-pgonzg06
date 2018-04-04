package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		
		Date today, tomorrow;

		try {
			today = new Date(20, 3, 2017);
			tomorrow = new Date(21, 3, 2018);
			System.out.println(today.toString());
			System.out.println(tomorrow.toString());
			
			//Metodos con if
		
			System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));
			System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthIf(tomorrow));
			System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayIf(tomorrow));
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSameIf(tomorrow));
		
			//Metodos sin if
		
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSameYear(tomorrow));
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));
		
			//Metodos con switch
		
			System.out.println(today + " this month is " + today.getMonthName());
			System.out.println(today.isDayRight(20));
			System.out.println(today + " the season is " + today.getMonthSeason());
		
			//Metodos con for
		
			System.out.println(today + " the months left are: " + today.monthLeft());
			System.out.println("Other date: " + today.otherDate());
			System.out.println(today + " the days left are: " + today.daysLeftOfMonth());
			//System.out.println(today + " the months with the same number of days are: " + today.monthsSameDays());
			
		} catch (DateException e) {
			System.out.println(e.getMessage());	
		}
		
	

	
	}

}
