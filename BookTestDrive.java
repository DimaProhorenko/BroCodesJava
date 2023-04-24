

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return String.format("Book title: %s || Book author: %s", this.title, this.author);
	}
}

public class BookTestDrive {
	public static void main(String[] args) {
		Book[] myBooks = new Book[3];
		Book hobbit = new Book("Hobbit", "Unknown");
		Book mistborn = new Book("Mistborn", "Sanderson");
		
		myBooks[0] = hobbit;
		myBooks[1] = mistborn;
		
		for (int i = 0; i < myBooks.length; i++) {
			System.out.println(myBooks[i]);
		}
	}
}
