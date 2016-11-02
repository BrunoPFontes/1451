package ca.bcit.comp1451.lab4.a00975687;



public class Bank {
	
	
	private String firstName;
	private String lastName;
	private double balance;
	
	//private Scanner input;
	
	
	
	public Bank(String firstName, String lastName, double balance) {
		setFirstName(firstName);
		setLastName(lastName);
		setBalance(balance);
		//input = new Scanner(System.in);
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public double getBalance() {
		return balance;
	}
	
	public String setFirstName(String firstName) {
		if((firstName != null) && !(firstName.equals("")) && !(firstName.equals(" "))){
		this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		}else {
			System.out.println("The name cannot be null, empty or just spaces. Please provide a valid name");
			setFirstName("unknown");
		}
		return this.firstName;
	}
	
	public String setLastName(String lastName) {
		
		if((lastName != null) && !(lastName.equals("")) && !(lastName.equals(" "))){
			this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
			}else {
				System.out.println("The name cannot be null, empty or just spaces. Please provide a valid name");
				setLastName("unknown");
			}
		
		return this.lastName;
	}

	public void setBalance(double balance) {
		if(balance >= 0){
			this.balance = balance;
		}else {
			System.out.println("The balance cannot be negative ");
			setBalance(balance);
		}
	}
	
	public void display(){
		System.out.println(" ######################## ");
		System.out.println(" First Name: " + firstName);
		System.out.println(" Last Name: " + lastName );
		System.out.println(" Balance: "    + balance );
		System.out.println(" ######################## ");
		System.out.println("");
	}
	
	public double deposit(double value){
		
			if(value >= 0){
				balance += value; 
			}else {
				System.out.println("You cannot deposit a negative value ");
				value = 0;
			
		}
		
		return balance;
		
	}
	
	public double withdraw(double value){		
		
			if(value >= 0 && value <= balance){
				balance -= value;
			}else {
				System.out.println("You cannot deposit a negative value and/or you cannot withdraw more than your balance ");
				value = 0;
			}
		
		return balance;
	}
	
	public double transfer(double value, Bank b){
		
		if(value >= 0 && value <= balance){
			withdraw(value);
			
			b.deposit(value);
		}else {
			System.out.println("You cannot transfer a negative value and/or you cannot withdraw more than your balance ");
			value = 0;
		}
		
		return balance;
	}
	
	
	

}
