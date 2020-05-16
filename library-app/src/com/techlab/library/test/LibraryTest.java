package com.techlab.library.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.library.Book;
import com.techlab.library.Library;

public class LibraryTest {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Book1", 10));
		books.add(new Book(2, "Book2", 15));
		books.add(new Book(3, "Book3", 20));
		books.add(new Book(4, "Book4", 25));
		books.add(new Book(5, "Book5", 30));
		printInfo(books);
		System.out.println("=====");
		Library library = new Library(1, "Lib", books);

		library.addBook(new Book(6, "Book6", 35));
//		printInfo(books);

		System.out.println(library.searchForBook("Book4").toString());
		System.out.println(library.removeBook("Book3"));
		printInfo(books);
	}

	private static void printInfo(List<Book> books) {
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

}
