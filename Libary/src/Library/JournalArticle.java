package Library;

public class JournalArticle extends Document{

	String journal; 
	String DOI; 
	
	public JournalArticle(String id, String title, String author, String publisher, String publicationDate, String journal, String DOI) {
		super(id, title, author, publisher, publicationDate);
		this.journal = journal; 
		this.DOI = DOI; 
	}
	
	public void setJournal(String j)
	{
		this.journal = j; 
	}
	
	public void setDOI(String d)
	{
		this.DOI = d; 
	}
}
