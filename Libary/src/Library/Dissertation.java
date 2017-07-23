package Library;

public class Dissertation extends Document{

	int wordCount; 
	int ISSN; 
	
	public Dissertation(String id, String title, String author, String publisher, String publicationDate, int wordCount, int ISSN) {
		super(id, title, author, publisher, publicationDate);
		this.wordCount = wordCount;
		this.ISSN = ISSN;
	}

	public void setWordCount(int w)
	{
		this.wordCount = w; 
	}
	
	public void setISSN(int i)
	{
		this.ISSN = i; 
	}

}
