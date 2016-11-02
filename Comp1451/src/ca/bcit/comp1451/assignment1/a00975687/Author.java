package ca.bcit.comp1451.assignment1.a00975687;

public class Author {
	Name author;
	Date birthDate;
	BookType genre;
	private String pseudonym;
	public Author(Name author, Date birthDate, BookType genre, String pseudonym) {
		super();
		this.author = author;
		this.birthDate = birthDate;
		this.genre = genre;
		this.pseudonym = pseudonym;
	}
	public String getPseudonym() {
		return pseudonym;
	}
	public void setPseudonym(String pseudonym) {
		if(pseudonym != null && !(pseudonym.isEmpty())){
			this.pseudonym = pseudonym.substring(0,1).toUpperCase() + pseudonym.substring(1).toLowerCase();
		}else{
			this.pseudonym = "unknown";
		}
	}
	
	
	
}
