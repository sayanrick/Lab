package Lab_Session_18th_aug.com.book;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	// Declaring parameterized constructor
	public Book(String bookId, String title, String author, String category, float price) {
//		super();
		try {
			if((bookId.startsWith("B")) && (bookId.length()<=4)) {
				this.bookId = bookId;
			}
			else {

				throw new InvalidBookException("Invalid Data...");
			}
			this.title = title;
			this.author = author;
			if(category == "Science" || category == "Fiction" || category == "Technology" || category == "Others") {
				this.category = category;
			}
			else {

				throw new InvalidBookException("Invalid Data");
			}

			if(price>=0) {
				this.price = price;
			}
			else {
				throw new InvalidBookException("Invalid Data");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	// getters 
	public String getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public float getPrice() {
		return price;
	}

}
class InvalidBookException extends Exception {
	public InvalidBookException(String s) {
		super(s);
	}
}
