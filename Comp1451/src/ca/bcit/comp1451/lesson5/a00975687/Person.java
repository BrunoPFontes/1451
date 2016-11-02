package ca.bcit.comp1451.lesson5.a00975687;

public class Person {
	
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private boolean isMale ;
	public Person(String firstName, String lastName, int yearOfBirth, boolean isMale) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setYearOfBirth(yearOfBirth);
		setMale(isMale);		
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public boolean isMale() {
		return isMale;
	}
	
	public String printPronom(){
		if( this.isMale == false){
			return "She";
		}else {
			return "He";
		}
	}
	
	
	public void setFirstName(String firstName) {
		if( (firstName != null) && firstName.length() > 0){
			this.firstName = firstName.substring(0, 1).toUpperCase() 
					       + firstName.substring(1).toLowerCase();			
		}else {
			this.firstName = "unknown";
		}
	}
	
	public void setLastName(String lastName) {
		if( (lastName != null) && lastName.length() > 0){
			this.lastName = lastName.substring(0, 1).toUpperCase() 
				       + lastName.substring(1).toLowerCase();					
		}else {
			this.lastName = "unknown";
		}
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public String printDetails(){
		String details = (	this.firstName + " " 
						  + this.lastName + " is a " 
						  + getClass().getSimpleName()
						  +". " + printPronom() 
						  + " was born in " + yearOfBirth ) ;
		
		return details;
	}
	
	
	
	
	

}
