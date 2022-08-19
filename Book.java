package Lab_Session_18th_aug.com.book;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	// Declaring parameterized constructor
	public Book(String bookId, String title, String author, String category, float price) {
		// If Validation fails then it will throw a custom exception called InvalidBookException
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
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;

	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}


}
// Custom Exception
class InvalidBookException extends Exception {
	public InvalidBookException(String s) {
		super(s);
	}
}
