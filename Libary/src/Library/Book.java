package Library;

public class Book extends Document {

	float deweyDecimal;
	boolean fiction;
	int pages; 
	
	public Book(String id, String title, String author, String publisher, String publicationDate,float deweyDecimal, boolean fiction, int pages ) {
		super(id, title, author, publisher, publicationDate);
		this.deweyDecimal = deweyDecimal; 
		this.fiction = fiction; 
		this.pages = pages; 
		
	}

	public float getDeweyDecimal() {
		return deweyDecimal;
	}

	public void setDeweyDecimal(float deweyDecimal) {
		this.deweyDecimal = deweyDecimal;
	}

	public boolean isFiction() {
		return fiction;
	}

	public void setFiction(boolean fiction) {
		this.fiction = fiction;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}


}
