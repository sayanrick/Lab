package Lab_Session_18th_aug.com.bookUtil;

import java.util.Scanner;

import Lab_Session_18th_aug.com.book.Book;
import Lab_Session_18th_aug.com.book.BookStore;

public class BookUtil {
	public static void main(String ...args) {
		// initializing BookStore class
		BookStore bs = new BookStore();
		// for loop to take user input to read data from the user for 3 book object
		/*
		for(int i=0; i<3; i++) {
			System.out.println("Enter BookId:- ");
			Scanner addBookId = new Scanner(System.in);
			String bookId = addBookId.nextLine();

			System.out.println("Enter Title:- ");
			Scanner addtitle = new Scanner(System.in);
			String title = addtitle.nextLine();

			System.out.println("Enter Author Name:- ");
			Scanner addAuthor = new Scanner(System.in);
			String author = addAuthor.nextLine();

			System.out.println("Enter Category:- ");
			Scanner addCategory = new Scanner(System.in);
			String category = addCategory.nextLine();

			System.out.println("Enter Price:- ");
			Scanner addPrice = new Scanner(System.in);
			Float price = addPrice.nextFloat();
			bs.addBook(new Book(bookId, title, author, category, price));
			bs.displayAll();
		}
		*/
		
		bs.addBook(new Book("B112", "Java", "Mr.ABC", "Technology", 1499));
		bs.addBook(new Book("B113", "C", "Mr.XYZ", "Technology", 1499));
		bs.addBook(new Book("B442", "Physics", "Mr.SD", "Science", 1499));
//		bs.displayAll();
//
//		System.out.println("Enter Title to search book:- ");
//		Scanner addSearch = new Scanner(System.in);
//		String search = addSearch.nextLine();
//		bs.searchByTitle(search);
//		
//		System.out.println("Enter Author name to search book:- ");
//		Scanner addSA = new Scanner(System.in);
//		String SA = addSA.nextLine();
//		bs.searchByAuthor(SA);
		bs.searchByTitle("Java");
//		bs.searchByAuthor("Mr.XYZ");
//		bs.displayAll();
	}
}


