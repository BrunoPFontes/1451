
package ca.bcit.comp1451.lesson2.a00975687;

public class Date {
	private int day;
	private int month;
	private int year;
	private int value;
	
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	private int addMonthCode(){
		int  addNumberCodeMonth = 0;
		
		if(year >= 1600 && year < 1700){
			addNumberCodeMonth = 6;
		}else if (year >= 1700 && year < 1800){
			addNumberCodeMonth = 4;
		}else if (year >= 1800 && year < 1900){
			addNumberCodeMonth = 2;
		}else if (year >= 2000 && year < 2100){
			addNumberCodeMonth = 6;
		}else if (year >= 2100 && year < 2200){
			addNumberCodeMonth = 4;
		}else {
			addNumberCodeMonth = 0;
		}
		return addNumberCodeMonth;
	}
	
	private boolean isLeapYear(){		
			
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	
	        if (isLeapYear)
	        {
	            isLeapYear = true;
	        } else {
	        	isLeapYear = false;
			}
			return isLeapYear;
	   
	}

	private int checkMonthCode(){
		
		int monthCode = 0;
		if(month == 1) {
			if(isLeapYear() == true){
				monthCode = 0 + addMonthCode();
			}else {
				monthCode = 1 + addMonthCode();
			}
			
		}else if (month == 2){
			if(isLeapYear() == true){
				monthCode = 3 + addMonthCode();
			}else {
				monthCode = 4 + addMonthCode();
			}
		}else if (month == 3){
			monthCode = 4  + addMonthCode();
		}else if (month == 4){
			monthCode = 0  + addMonthCode();
		}else if (month == 5){
			monthCode = 2 + addMonthCode();
		}else if (month == 6){
			monthCode = 5 + addMonthCode();
		}else if (month == 7){
			monthCode = 0 + addMonthCode();
		}else if (month == 8){
			monthCode = 3 + addMonthCode();
		}else if (month == 9){
			monthCode = 6 + addMonthCode();
		}else if (month == 10){
			monthCode = 1 + addMonthCode();
		}else if (month == 11){
			monthCode = 4 + addMonthCode();
		}else{ 
			monthCode = 6 + addMonthCode();
		}
		return monthCode;
	}
	
	public String getDayOfTheWeek()
	{	
		
		int last2Digits = year % 100;
		int numberOf12 = last2Digits / 12;
		int remainderOf12 = last2Digits % 12;
		int numberOf4 = remainderOf12 / 4;
		
		int checkSum = (numberOf12 + remainderOf12 + numberOf4 + this.day + checkMonthCode());
		
		int checkDay =  checkSum % 7;
		
		String dayOfWeek = null;
		
		if(checkDay == 0){
			dayOfWeek = "Saturday";
		}else if (checkDay == 1) {
			dayOfWeek = "Sunday";
		}else if (checkDay == 2) {
			dayOfWeek = "Monday";
		}else if (checkDay == 3) {
			dayOfWeek = "Tuesday";
		}else if (checkDay == 4) {
			dayOfWeek = "Wednesday";
		}else if (checkDay == 5) {
			dayOfWeek = "Thursday";
		}else if (checkDay == 6) {
			dayOfWeek = "Fryday";
		}
		return dayOfWeek;
	}	
	
	
	
}


	
	

