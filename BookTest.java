package com.exceptions.demo;

public class BookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"Java");
		Book book2 = new Book(2,"Python");
		Book book3 = new Book(3,"Dbms");
		Book book4 = new Book(4,"Networking");
		Book book5 = new Book(5,"Orakle");
		
		
		Book books[] = {book1,book2,book3,book4,book5};
		
		
		try {
			if(findById(books,10)) {
				System.out.println("Book is present");
			}
			else{
				throw new BookNotFoundException("Book with the given id is not present");
			}
		}catch(BookNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean findById(Book[] books , int id) {
		for(Book b:books) {
			if(b.getId()==id)
			return true;
		}
		return false;
	}


}
