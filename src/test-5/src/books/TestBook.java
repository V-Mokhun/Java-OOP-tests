package books;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBook {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
		books.add(new Book("The Catcher in the Rye", "J. D. Salinger", 1951));
		books.add(new Book("The", "John Steinbeck", 1939));
		books.add(new Book("To Kill a", "Harper Lee", 1960));

		System.out.println(books.toString());
		books.sort(null);
		System.out.println(books.toString());
	}
}
