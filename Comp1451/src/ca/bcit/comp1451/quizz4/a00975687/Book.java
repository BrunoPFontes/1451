package ca.bcit.comp1451.quizz4.a00975687;

public class Book {
	
		public static final String FIRST_BOOK_PUBLISHED_YEAR = "1455";
		private int yearPublished;
		private String authorFirstName;
		private String authorLastName;
		private String title;
		
		int stringLength;
		
		
		public Book(int yearPublished, String title, String authorFirstName, String authorLastName) {
		super();
		this.yearPublished = yearPublished; 
		this.title = title;
		this.authorFirstName = authorFirstName; 
		this.authorLastName = authorLastName;
		
		}

		private String fullName() {
		return getAuthorFirstName() + " " + getAuthorLastName(); 
		}
		
		public String getAuthorInitials() {
		        String authorInitials = authorFirstName.substring(0, 1).toUpperCase() + "." + authorLastName.substring(0, 1).toUpperCase() + ".";
		        return authorInitials;
		}
		
		public String getDetails() {
		return getTitle().toUpperCase() + " WAS PUBLISHED BY " + fullName().toUpperCase() + " IN " + getYearPublished() + "!" ;
		}
		
		public int getYearPublished() {
		return yearPublished;
		}
		
		public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
		}
		
		public String getAuthorFirstName() {
		return titleCase(authorFirstName);
		}
		
		public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
		}
		
		public String setAuthorLastName(String authorLastName) {
			stringLength = authorLastName.length();
			String theRest = authorLastName.substring(0, stringLength - 1);
			String theLastCharacter =  authorLastName.substring(stringLength -1, stringLength);
			this.authorLastName = theRest.toLowerCase() + theLastCharacter.toUpperCase();
			return this.authorLastName;
		}
		
		public String getAuthorLastName() {
			return titleCase(this.authorLastName);
			}
			
		public int getStringLength(){
			return stringLength;
		}
		
		public String getTitle() {
		return titleCase(title);
		}
		
		public void setTitle(String title) {
		this.title = title;
		}
		
		public static String titleCase(String name) {
			if (name != null && name.trim().length() > 0) {
			String firstLetter = name.trim().toUpperCase().substring(0, 1);
			String theRest = name.trim().toLowerCase().substring(1);
			return firstLetter + theRest;
			} else {
			return null;
			}
		}

		public static String getActivity() {
		        String s = "Reading";
		        return s;
		        
		    }

		
}
