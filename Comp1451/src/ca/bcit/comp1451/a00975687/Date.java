package ca.bcit.comp1451.a00975687;


import java.util.Calendar;

public class Date {

	public final int DEFAULT_YEAR = 1900;
	public final int DEFAULT_MONTH = 1;
	public final int LIMIT_MONTH = 13;
	public final int DEFAULT_DAY = 1;
	public final int LIMIT_DAY = 32;

	private int year;
	private int month;
	private int day;

	private int currentYear = Calendar.getInstance().get(Calendar.YEAR);





	public Date(int year, int month, int day) {

		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int year) {
		if((year > 0) && (year <= currentYear)){
			this.year = year;
		}else {
			this.year = DEFAULT_YEAR;
		}

	}
	public void setMonth(int month) {
		if((month >0) & (month <LIMIT_MONTH)){
			this.month = month;			
		}else {
			this.month = DEFAULT_MONTH;
		}

	}
	public void setDay(int day) {
		if((day >0) & (day <LIMIT_DAY)){
			this.day = day;			
		}else {
			this.day = DEFAULT_DAY;
		}
	}
	
	public String getDate(){
		return getYear() + "-" + getMonth() + "-" + getDay();
	} 




}
