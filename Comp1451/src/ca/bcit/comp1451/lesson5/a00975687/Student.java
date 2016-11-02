package ca.bcit.comp1451.lesson5.a00975687;

public class Student extends Person {
	
	private String studentNumber;
	private String major;
	private double pointAverage;
	
	
	
	
	public Student(String firstName, String lastName, int yearOfBirth, boolean isMale, String studentNumber,
			String major, double pointAverage) {
		super(firstName, lastName, yearOfBirth, isMale);
		this.studentNumber = studentNumber;
		this.major = major;
		this.pointAverage = pointAverage;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}

	public String getMajor() {
		return major;
	}

	public double getPointAverage() {
		return pointAverage;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setPointAverage(double pointAverage) {
		this.pointAverage = pointAverage;
	}
	public String printDetails(){
		String details = (super.getFirstName() + " " + super.getLastName() + " " + "is a " + getClass().getSimpleName() + " of " + major + "(st# "+ studentNumber
				+ ")." + super.printPronom() + " was born in " + super.getYearOfBirth());
		return details;
		
		
	}
	
}
