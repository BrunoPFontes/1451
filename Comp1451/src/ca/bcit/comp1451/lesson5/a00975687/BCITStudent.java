package ca.bcit.comp1451.lesson5.a00975687;

public class BCITStudent extends Student {
	public final static int  NUMBER_OF_CAMPUS = 5;
	
	private int campus;
	

	public BCITStudent(String firstName, String lastName, int yearOfBirth, boolean isMale, String studentNumber,
			String major, double pointAverage, int campus) {
		super(firstName, lastName, yearOfBirth, isMale, studentNumber, major, pointAverage);
		this.campus = campus;
	}
	
	public BCITStudent(String firstName, String lastName, int yearOfBirth, boolean isMale, String studentNumber,
			String major, double pointAverage) {
		super(firstName, lastName, yearOfBirth, isMale, studentNumber, major, pointAverage);
		
	}
	
	
	

	public int getCampus() {
		return campus;
	}



	public void setCampus(int campus) {
		if(campus > 0 && campus < NUMBER_OF_CAMPUS){
			this.campus = campus;
		}else {
			System.out.println("The campus number must be 1 for Burnaby, 2 for Downtown, 3 for Richmond and 4 for North Vancouver");
		}
	}
	
	public String getCampusName(){
		
		String campusName = "";
		if(campus == 1){
			campusName = " at Burnaby campus";
		}else if (campus == 2){
			campusName = " at Downtown campus";
			
		}else if (campus == 3){
			campusName = " at Richmond campus";
		}else if (campus == 4){
			campusName = " at North Vancouver campus";
		}else {
			campusName = "";
		}
		
		return campusName;
		
	}
	
	public void setStundentNumber(String studentNumber){
		if(studentNumber != null ){
			super.setStudentNumber("A" + studentNumber );
		}else {
			super.setStudentNumber("A" + 00000000);
		}
	}



	public String printDetails(){
		String details =(super.getFirstName() + " " + super.getLastName() + " " + "is a " + getClass().getSimpleName() + " of " + super.getMajor() + " (st# A"+ super.getStudentNumber() + ")" + getCampusName() + "." +
				" " + super.printPronom() + " was born in " + super.getYearOfBirth());
		return details;
	}
	
	/*
	public String printDetailsWithoutCampus(){
		String details =(super.getFirstName() + " " + super.getLastName() + " " + "is a " + getClass().getSimpleName() + " of " + super.getMajor() + " (st# "+ super.getStudentNumber() + "). " +
				" " + super.printPronom() + " was born in " + super.getYearOfBirth());
		return details;
	}
	*/
	
	

}
