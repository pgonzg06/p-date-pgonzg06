package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia
		
		if (day < 1 || day > 31){
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y 31.");
		} else {
			this.day = day;
		}
	}
	
	
	
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	
	
	void setYear(){
		this.year = year;	
	}

	void setDay(){
		this.day = day;
	}
	
	void setMonth(){
		this.month = month;
	}

	//Metodos en if
	
	boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	
	boolean isSameMonthIf(Date another){
        if(this.month == another.getMonth()){
            return true;
        }
        return false;
    }
   
    boolean isSameDayIf(Date another){
        if(this.day == another.getDay()){
                return true;
        }
        return false;
    }
    
	boolean isSameIf(Date another){
		if( (this.year == another.getYear()) && (this.month == another.getMonth()) && (this.day == another.getDay()) ){
			return true;
		}
		return false;
	}
	
	//Metodos sin if
	
	boolean isSameYear(Date another){
		boolean equalyear = false;
		equalyear = (this.year == another.getYear());
		return equalyear;
	}
	
	boolean isSameMonth(Date another){
		boolean equalmonth = false;
		equalmonth = (this.month == another.getMonth());
		return equalmonth;
	}
	
	boolean isSameDay(Date another){
		boolean equalday = false;
		equalday = (this.day == another.getDay());
		return equalday;
	}
	
	boolean isSame(Date another){
		boolean equalsame = false;
		equalsame = ( (this.year == another.getYear()) && (this.month == another.getMonth()) && (this.day == another.getDay()) );
		return equalsame;
	}
	
	
	//Metodos con switch
	
	String getMonthName(){
        String name;
        switch(this.month){
                     
            case 1: 
					name="January";
                    break;
            case 2: 
					name="February";
					break;
			case 3: 
					name="March";
					break;
			case 4: 
					name="April";
					break;
			case 5: 
					name="May";
					break;
			case 6: 
					name="June";
					break;
			case 7: 
					name="July";
					break;
			case 8: 
					name="August";
					break;
			case 9: 
					name="September";
					break;
			case 10: 
					name="October";
					break;
			case 11: 
					name="November";
					break;
			default:
					name="December";
					
            }
			return name;
    }

	
	boolean isDayRight(int day){
        boolean correctDay = false;
        switch(this.day){
                   
			case 1: //next	
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
					if( (this.day >= 1) && (this.day <= 31) ){
						correctDay = true;
					}
					break;
			case 2:
					if ( (this.day >= 1) && (this.day <= 28) ){
						correctDay = true;
					}
					break;
			default:
					if( (this.day >= 1) && (this.day <= 30) ){
						correctDay = true;
					}
					
		}
		return correctDay;
	}
	
	
	String getMonthSeason(){
        String season;
        switch(this.month){

			case 1: //next
			case 2: //next
			case 3: 
					season="Winter";
					break;
			case 4: //next
			case 5: //next
			case 6: 
					season="Spring";
                    break;
			case 7: //next
			case 8: //next
			case 9: 
    				season="Summer";
                    break;
			default:
               		season="Fall";
				
					 
		}
		return season;
	}
               

	//Metodos con for
	
	public String toString(){
		
		return this.day + "/" + this.month + "/" + this.year;
		
	}
	
	
	public String monthLeft(){
		int variable = this.month;
		StringBuilder months = new StringBuilder();
		for(int i=this.month+1;i<=12;i++){
			this.month = this.month+1;
			months.append(this.getMonthName());
		}
		this.month = variable;
		return months.toString();
		
	}
	
	
	public String otherDate(){
		
		String date = new String();
		try{
			
			Date other = new Date(2, 4, 1999);
			date = (other.getDay() + "/" + other.getMonth() + "/" + other.getYear());
		
		} catch (DateException e){
			System.out.println(e.getMessage());
		}
			
		return date;
	}
			
			
		
	
	
	public int numDaysMonths(){
		int numDays=0;
		switch(this.month){
                   
			case 1: //next	
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
					numDays=31;
					break;
			case 2:
					numDays=28;
					break;
			default:
					numDays=30;
		
		}
		return numDays;		
					
	}
	
	public String daysLeftOfMonth(){
		StringBuilder days = new StringBuilder();
		int numDays = this.numDaysMonths();
		for(int i=this.day+1;i<=numDays;i++){
				this.day = this.day+1;
				days.append(this.getDay());
				
		}
		return days.toString();
			
			
	}	
	
				
	
	public String monthsSameDays(){
		StringBuilder sameMonths = new StringBuilder();
		int variable = this.month;
		int numDays = this.numDaysMonths();
		for(int i=this.month+1;i<=numDays;i++){
				this.month = this.month+1;
				sameMonths.append(this.getMonthName());
		}
		this.month = variable;
		return sameMonths.toString();
	}
			
				
				
			
			
			
			
			
			
			
			
}


