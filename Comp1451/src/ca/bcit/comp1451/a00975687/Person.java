package ca.bcit.comp1451.a00975687;

public class Person {
	
	
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	double x;
	
	
	
	public Person(String firstName, String lastName, int yearOfBirth) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setYearOfBirth(yearOfBirth);
		
	}

	public String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		if((firstName != null) && (firstName != "")){
			this.firstName = firstName;
		}else {
			this.firstName = "default";
		}
		
	}

	public String getLastName() {		
		return lastName;
	}

	private void setLastName(String lastName) {
		if((firstName != null) && (firstName != "")){
			this.lastName = lastName;
		}else {
			this.firstName = "default";
		}
		
	}

	public int getYearOfBirth() {
		
		return yearOfBirth;
	}

	private void setYearOfBirth(int yearOfBirth) {
		if((yearOfBirth != 0) && (yearOfBirth <= 2016) ){
			this.yearOfBirth = yearOfBirth;
		}else {
			this.yearOfBirth = 1900;
		}
		
	}
	
	
	
	
	
}
