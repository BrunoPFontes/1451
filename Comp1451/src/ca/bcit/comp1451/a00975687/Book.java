package ca.bcit.comp1451.a00975687;

public class Book {
	private String title;
	private Date d;
	
	public Book(String title, Date d) {
		
		this.title = title;
		this.d = d;
	}
	
	public Book (String title, int year, int month, int day ){
		setTitle(title);
		d.setYear(year);
		d.setMonth(month);
		d.setDay(day);
				
	}

	public String getTitle() {
		return title;
	}

	public Date getD() {
		return d;
	}

	public void setTitle(String title) {
		if(title != null && title != ""){
			this.title = title;			
		}else {
			this.title = "unknown";
		}
	}

	public void setD(Date d) {
		this.d = d;
	}
	
	
}
