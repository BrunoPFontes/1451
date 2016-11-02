package ca.bcit.comp1451.assignment1.a00975687;

public class Name {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name(String firstName, String middleName, String lastName) {
		super();
		
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);		
		
	}
	
	public Name(String firstName) {
		super();
		
		setFirstName(firstName);
			
		
	}
	
	public Name(String firstName, String lastName) {
		super();
		
		setFirstName(firstName);		
		setLastName(lastName);		
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		if(firstName != null && !(firstName.isEmpty())){
			this.firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		}else{
			this.firstName = "unknown";
		}
	}
	public void setMiddleName(String middleName) {
		if(middleName != null && !(middleName.isEmpty())){
			this.middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1).toLowerCase();
		}else{
			this.middleName = "unknown";
		}
	}
	public void setLastName(String lastName) {
		if(lastName != null && !(lastName.isEmpty())){
			this.lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
		}else{
			this.lastName = "unknown";
		}
	}
	
	

}
