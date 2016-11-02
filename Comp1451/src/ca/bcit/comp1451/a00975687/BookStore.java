package ca.bcit.comp1451.a00975687;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BookStore {
	private ArrayList<Book> booksList;
	private Book[] booksArray;
	
	public BookStore(){
		booksList = new ArrayList<>();
		booksArray = new Book[5];
		
		booksArray[0] = new Book("book1", 2001, 1,1); 
		booksArray[1] = new Book("book2", 2000, 1,1); 
		booksArray[2] = new Book("book3", 2003, 1,1); 
		booksArray[3] = new Book("book4", 2004, 1,1); 
		booksArray[4] = new Book("book5", 2005, 1,1); 
		
		
	}
	
	public void addBook(Book book){
		if(book != null) {
			booksList.add(book);
		}
	}
	
	public void displayBook(){
		Iterator<Book> it = booksList.iterator();
		while(it.hasNext()){
			Book b = it.next();
			System.out.println(b.getTitle());
		}
			
			
		for(Book bA : booksArray){
			System.out.println(bA.getTitle());	
		}	
	}
	
	
	
	
}
