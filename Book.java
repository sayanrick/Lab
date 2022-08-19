package Lab_Session_18th_aug.com.book;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	// Declaring parameterized constructor
	public Book(String bookId, String title, String author, String category, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	// getters and setters
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
//		if(this.category.co))
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
			this.price = price;
		
	}

		
	public boolean validation() throws Exception {
		if(category == "Science" || category == "Fiction" || category == "Technology" || category == "Others" && price > 0 &&
				bookId.startsWith("B") && bookId.length() <= 4) {
			return true;
		} else {
			
			throw new InvalidBookException("Invalid Data...");
		}	
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
}
class InvalidBookException extends Exception {
	public InvalidBookException(String s) {
		super(s);
	}
}
