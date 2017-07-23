package Library;
import java.io.IOException;
import java.util.ArrayList;

public class Library implements BookingSystem {
	ArrayList<Document> contents = new ArrayList<Document>();
	ArrayList<Person> customers = new ArrayList<Person>();
	
	@Override
	public void checkOut(Document d, Person p) {
		p.add(d);
	    remove(d);
	}
	@Override
	public void checkIn(Document d, Person P) {
		contents.add(d);
		P.remove(d);
		
	}
	@Override
	public Document search(String id) {
	    for(Document d: contents)
	    {
	    	if (d.getId().equals(id))
	    	{
	    		return d;
	    	}
	    }
		return null;
	}
	@Override
	public Person search(String Name, String Address) {
		for(Person p: customers)
	    {
	    	if (p.getName().equals(Name) || p.getAddress().equals(Address))
	    	{
	    		return p;
	    	}
	    }
		return null;
	}
	
	@Override
	public void addPerson(String name, String address) {
		customers.add(new Person(name, address));
		
	}
	@Override
	public void updatePerson(Person p, int whatToUpdate, String newInfo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add(String id, String title, String author, String publisher, String publicationDate, int wordCount,int ISSN) {
		contents.add(new Dissertation(id, title, author, publisher, publicationDate, wordCount, ISSN));
		
	}
	@Override
	public void add(String id, String title, String author, String publisher, String publicationDate, String journal,String DOI) {
		contents.add(new JournalArticle(id, title, author, publisher, publicationDate, journal, DOI));
		
	}
	@Override
	public void add(String id, String title, String author, String publisher, String publicationDate,float deweyDecimal, boolean fiction, int pages) {
		contents.add(new Book(id, title, author, publisher, publicationDate, deweyDecimal, fiction, pages));
		
	}
	@Override
	public void remove(Document d) {
		contents.remove(d); 
		
	}
	@Override
	public void remove(Person p) {
		customers.remove(p);
		
	}
	@Override
	public void update(Dissertation d, int fieldSelect, String newInput) {
		
		switch(fieldSelect)
		{
		case 0:
			d.setTitle(newInput);
			break;
		case 1:
			d.setAuthor(newInput);
			break;
		case 2:
			d.setPublisher(newInput);
			break;
		case 3:
			d.setPublicationDate(newInput);
			break;
		case 4: 
			d.setWordCount((Integer.parseInt(newInput)));
			break;
		case 5:
			d.setISSN((Integer.parseInt(newInput)));
			break;
		default:
			System.out.println("Invalid field");
		}
		remove(search(d.getId()));
		contents.add(d);
		
	}
	@Override
	public void update(Book d, int fieldSelect, String newInput) {
		switch(fieldSelect)
		{
		case 0:
			d.setTitle(newInput);
			break;
		case 1:
			d.setAuthor(newInput);
			break;
		case 2:
			d.setPublisher(newInput);
			break;
		case 3:
			d.setPublicationDate(newInput);
			break;
		case 4: 
			d.setDeweyDecimal(Float.parseFloat(newInput));
			break;
		case 5:
			d.setFiction(Boolean.parseBoolean(newInput));
		case 6:
			d.setPages(Integer.parseInt(newInput));
		default:
			System.out.println("Invalid field");
			
		}
		remove(search(d.getId()));
		contents.add(d);
		
	}
	@Override
	public void update(JournalArticle d, int fieldSelect, String newInput) {
		switch(fieldSelect)
		{
		case 0:
			d.setTitle(newInput);
			break;
		case 1:
			d.setAuthor(newInput);
			break;
		case 2:
			d.setPublisher(newInput);
			break;
		case 3:
			d.setPublicationDate(newInput);
			break;
		case 4: 
			d.setJournal(newInput);
			break;
		case 5:
			d.setDOI(newInput);
	    default:
		    System.out.println("Invalid field");
		}
		remove(search(d.getId()));
		contents.add(d);
	}
	
	
	public void save()
	{
		ReaderWriter.writeStringToFile(toWrite, "/home/deaglanl/contents.txt", false);
	}
	
	public void load()
	{
	   try {
		ReaderWriter.readFileToString("/home/deaglanl/contents.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
