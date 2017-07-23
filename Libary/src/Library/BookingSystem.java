package Library;

public interface BookingSystem {
	
	public void checkOut(Document d, Person P);
	
	public void checkIn(Document d, Person P);
	
	public void add(String id, String title, String author, String publisher, String publicationDate, int wordCount, int ISSN);
	
	public void add(String id, String title, String author, String publisher, String publicationDate, String journal, String DOI);
	
	public void add(String id, String title, String author, String publisher, String publicationDate,float deweyDecimal, boolean fiction, int pages );
	
	public void remove(Document d); 
	
	public void remove(Person p); 
	
	public void update(Dissertation d, int fieldSelect, String newInput);
	
	public void update(Book d, int fieldSelect, String newInput);
	
	public void update(JournalArticle d, int fieldSelect, String newInput);
	
	public Document search(String id);
	
	public Person search(String Name, String Address); 
	
	public void addPerson(String name, String address);
	
	void updatePerson(Person p, int whatToUpdate, String newInfo); 
	
	public void save();
	
	public void load();
	
	
	
	
	
	

}
