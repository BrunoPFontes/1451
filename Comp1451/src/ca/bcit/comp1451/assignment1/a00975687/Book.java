package ca.bcit.comp1451.assignment1.a00975687;

public class Book extends Item {
	Author author;
	Date datePublished;
	private String title;
	BookType genre;
	public Book(double weightKg, double manufacturingPriceDollars, double suggestedReatailPriceDollars, String uniqueID,
			Author author, Date datePublished, String title, BookType genre) {
		super(weightKg, manufacturingPriceDollars, suggestedReatailPriceDollars, uniqueID);
		this.author = author;
		this.datePublished = datePublished;
		setTitle(title);
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && !(title.isEmpty())){
			this.title = title;		
		}else{
			this.title = "unknown";
		}
	}
	
	public void setISBN(String ISBN){
		super.setUniqueID(ISBN);
	}
	
	public String getISBN(){
		return super.getUniqueID();
	}
	
	public Date getYearPublished(){
		return datePublished;
	}
	
	public Author getAuthorFullName(){
		return author;
	}
	
	public String getGenreString(){
		return BookType.values().toString().toLowerCase();
	}
	
	
}
