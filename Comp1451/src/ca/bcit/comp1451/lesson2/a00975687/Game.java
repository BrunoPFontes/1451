package ca.bcit.comp1451.lesson2.a00975687;

import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	final static int CURRENT_YEAR = 2016;
	
	private int randomYear;
	
	private int randomMonth;
	
	private int randomDay;
	
	
	
	public int getRandomYear() {
		return randomYear;
	}

	public int getRandomMonth() {
		return randomMonth;
	}

	public int getRandomDay() {
		return randomDay;
	}

	Random r = new Random();
	
	Scanner s = new Scanner(System.in);
	
	GregorianCalendar gc = new GregorianCalendar();
	
	Date d;
	
	
	
	
	public int randBetween(int start, int end){
		return start + (int)Math.round(Math.random() * (end - start));
	}
	
	/*
	public void getRandomDate(){
		int year = randBetween(1600, 2199);
		gc.set(gc.YEAR, year);
		
		int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
		
		gc.set(gc.DAY_OF_YEAR, dayOfYear);
		
		System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1 ) + "-" + gc.get(gc.DAY_OF_MONTH));
		
		randomYear = year;
		randomMonth = (int)(gc.get(gc.MONTH) + 1);
		randomDay = (int)(gc.get(gc.DAY_OF_MONTH));	
		
		
	}
	*/
	public void getRandomDate(){
		this.randomYear = r.nextInt(600) + 1600;
		this.randomMonth = r.nextInt(12) + 1;
		this.randomDay = r.nextInt(31) + 1;
		
		
		if((randomMonth == 2) && ((randomYear % 4 == 0) && (randomYear % 100 != 0) || (randomYear % 400 == 0))) {
			this.randomDay = r.nextInt(29) + 1;
		}else if(randomMonth == 2) {
			this.randomDay = r.nextInt(28) + 1;	
		}else if(randomMonth ==  4 || randomMonth == 6 || randomMonth == 9 || randomMonth == 11) {
			this.randomDay = r.nextInt(30) + 1;
		}
				
		d = new Date(randomYear,randomMonth ,randomDay );
		
		//System.out.println(randomYear + "-" + randomMonth + "-" + randomDay);
		
	}
	
	public void getRandomDateBirthDate(){
		this.randomYear = r.nextInt(200) + 1900;
		this.randomMonth = r.nextInt(12) + 1;
		this.randomDay = r.nextInt(31) + 1;
		
		
		if((randomMonth == 2) && ((randomYear % 4 == 0) && (randomYear % 100 != 0) || (randomYear % 400 == 0))) {
			this.randomDay = r.nextInt(29) + 1;
		}else if(randomMonth == 2) {
			this.randomDay = r.nextInt(28) + 1;	
		}else if(randomMonth ==  4 || randomMonth == 6 || randomMonth == 9 || randomMonth == 11) {
			this.randomDay = r.nextInt(30) + 1;
		}
				
		d = new Date(randomYear,randomMonth ,randomDay );
		
		//System.out.println(randomYear + "-" + randomMonth + "-" + randomDay);
	}

	private int guessYear(){
		
		int userGuessYear = 0;
		
		
		
		boolean correct = false;
			
			while(correct == false)
			{
				System.out.println("Please guess the year (or Q to quit)");
				if(s.hasNextInt())
				{
					userGuessYear = s.nextInt();
					if( userGuessYear >  1599 && userGuessYear < 2200 )
					{
						if(userGuessYear == randomYear){
							System.out.println("Correct the year is " + userGuessYear + " Now guess the month: ");
							correct = true;
								
						}else if(userGuessYear < randomYear){
							System.out.println("Wrong the value is higher");
						}else if (userGuessYear > randomYear){
							System.out.println("Wrong the value is lower");
						}
					}
										
				}else
				{
						String error = s.nextLine();
						
						if( error.equalsIgnoreCase("q")){
							System.out.println("Bye Bye!!!");
							correct = true;
						}else {
							System.out.println("You must provide a value between 1600 and 2199. This value " + error + " is not valid");
						}
				}
					
					
		}
		return userGuessYear;
	}
	
	private int guessMonth(){
		int userGuessMonth = 0;

		boolean correct = false;
		
		
		
			while(correct == false)				
			{
				System.out.println("Please guess the Month (or Q to quit)");
				
				if(s.hasNextInt())
				{
					userGuessMonth = s.nextInt();
					if( userGuessMonth >  0 && userGuessMonth < 13)
					{
						if(userGuessMonth == randomMonth){
							System.out.println("Correct the month is " + userGuessMonth + " Now guess the day: ");
							correct = true;
						}else if(userGuessMonth < randomMonth){
							System.out.println("Wrong the value is higher");
						}else {
							System.out.println("Wrong the value is lower");
						}
					}	
				}else
				{
					String error = s.nextLine();
					
					if( error.equalsIgnoreCase("q")){
						correct = true;
					}else {
						System.out.println("You must provide a value between 1 and 12. This value " + error + " is not valid");
					}
				}
					
					
		}
		
		return userGuessMonth;
	}

	private int guessDay()
	{
		d = new Date(randomYear, randomMonth, randomDay);
		
		int userGuessDay = 0;
		
		boolean correct = false;
			
			while(correct == false)
			{
				System.out.println("Please guess the day (or Q to quit)");
				if(s.hasNextInt())
				{
					userGuessDay = s.nextInt();
					if( userGuessDay >=  1 && userGuessDay <= 31 )
					{					
						if(userGuessDay == randomDay)
						{
							System.out.println("Correct the day is " + userGuessDay);
							correct = true;
						}else if(userGuessDay < randomDay)
						{
							System.out.println("Wrong the value is higher");
						}else if(userGuessDay > randomDay)
						{
							System.out.println("Wrong the value is lower");
						}
					}	
				}else
				{
					String error = s.nextLine();
					
					if( error.equalsIgnoreCase("q"))
					{
						correct = true;
					}else 
					{
						System.out.println("You must provide a value between 1 and 31. This value " + error + " is not valid");
					}
				}
					
				
		  }
		System.out.println("Congratulations you have finished the game, the date was: " + randomYear + "/" + randomMonth + "/" + randomDay + " - week's day was(will be): " + d.getDayOfTheWeek() );
		System.out.println("End of game!!!");
		return userGuessDay;	
	}
	
	private void display(){
		System.out.println(randomYear);
		System.out.println(randomMonth);
		System.out.println(randomDay);
	}
	
	public void guessTheDate(){
		getRandomDate();
		boolean endGame = false;
		while(endGame == false){
			guessYear();
			guessMonth();
			guessDay();
			endGame = true;
		}
	}
			
	public void guessTheBirthdateDay(){
		int count = 0;
		
		for (int i = 1; i < 6; i++) {
			getRandomDateBirthDate();
			d = new Date(randomYear, randomMonth, randomDay);
			
			System.out.println("Date #" + i+ " What day of the week was " + randomYear + "-" + randomMonth + "-" + randomDay);
			d.getDayOfTheWeek();
			
			String userGuess = s.next();
			
			if(userGuess.equalsIgnoreCase(d.getDayOfTheWeek())){
				System.out.println("Correct!");
				count++;
			}else {
				System.out.println("wrong the day is: " + d.getDayOfTheWeek());
			}
			
			
		}
		
		System.out.println("You scored " + count + " out of 5. Game over.");
		
	}
	
	

	
	
	
	
	
	/*
			All this methods are working, but it takes 1 whole day to make it and they are not so readable. 
	
	
	public int getRandomYear(){
		int randomYear = 1600 + r.nextInt(600);
		
		return randomYear;
	}
	
	public int getRandomMonth(){
		int randomMonth = 1 + r.nextInt(11);
		return randomMonth;
	}
	
	public int getRandomDay(){
		int getRandomDay = 0;
		if(((getRandomMonth() == 1) || ((getRandomMonth() == 3) || ((getRandomMonth() == 5) || ((getRandomMonth() == 7) || ((getRandomMonth() == 8) || 
			((getRandomMonth() == 10) || ((getRandomMonth() == 12))))))))){
					getRandomDay = 1 + r.nextInt(31);
			}
		if((getRandomMonth() == 4) || ((getRandomMonth() == 6) || ((getRandomMonth() == 9) || ((getRandomMonth() == 11))))){
				getRandomDay = 1 + r.nextInt(30);
		}
		if((getRandomMonth() == 2) && ((getRandomYear() % 4 == 0) && (getRandomYear() % 100 != 0) || (getRandomYear() % 400 == 0)) ){
			getRandomDay = 1 + r.nextInt(28);
		}else{
			getRandomDay = 1 + r.nextInt(29);
		}
		return getRandomDay;
	}
	
	
	
	/*public Date getRandomDate(){
		Date rDate = new Date(getRandomDay(), getRandomMonth(), getRandomYear());
		
		return rDate;
	}
	
	*public void guessTheDate(){
		 getRandomDay();
		 getRandomMonth();
		 getRandomYear();
		 
	}
	*
	*
	*/
	
	

}
