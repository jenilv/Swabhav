package com.techlab.library;

import java.util.List;

public class Library {

	private int libraryId;
	private String libraryName;
	private List<Book> books;

	public Library(int libraryId, String libraryName, List<Book> books) {
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.books = books;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public Book searchForBook(String bookName) {
		for (Book book : books) {
			if (bookName.equalsIgnoreCase(book.getBookName())) {
				return book;
			}
		}

		return null;
	}

	public boolean removeBook(String bookName) {
		Book bookToDelete = null;
		for (Book book : books) {
			if (bookName.equalsIgnoreCase(book.getBookName())) {
				bookToDelete = book;
			}
		}

		return books.remove(bookToDelete);
	}
}
