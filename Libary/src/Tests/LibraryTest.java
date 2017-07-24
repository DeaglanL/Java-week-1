package Tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Library.Book;
import Library.Library;
import Library.Person;

public class LibraryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckOut() {
		Library l = new Library();
		l.add("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187);
		l.addPerson("Deaglan Lynch", "111 manc road");
		l.checkOut(l.search("123"), l.search("Deaglan Lynch", "111 manc road"));
		assertNull(l.search("123"));
		//Check if its in persons list 
	}

	@Test
	public void testCheckIn() {
		Library l = new Library();
		Book b = new Book("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187);
		Person p = new Person("Deaglan Lynch", "111 manc road");
		p.add(b); 
		l.checkIn(p.search("123"), p);
		assertNotNull(l.search("123"));
	}

	@Test
	public void testUpdate() {
		Library l = new Library();
		l.add("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187);
		Book b = (Book) l.search("123");
		l.update(b, 0, "A terrible book");
		assertEquals(l.search("123").getTitle(), "A terrible book");
		
	}

	@Test
	public void testSearchString() {
		Library l = new Library();
		l.add("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187);
		assertEquals(l.search("123").getTitle(), "Of Mice and Men");
	}

	@Test
	public void testSearchStringString() {
		Library l = new Library(); 
		l.addPerson("Deaglan Lynch", "111 manc road");
		assertNotNull(l.search("Deaglan Lynch", "111 manc road"));
	}

	@Test
	public void testAddPerson() {
		Library l = new Library(); 
		l.addPerson("Deaglan Lynch", "111 manc road");
		assertNotNull(l.search("Deaglan Lynch", "111 manc road"));
	}

	@Test
	public void testUpdatePerson() {
		Library l = new Library();
		l.addPerson("Deaglan", "123 cambridge road");
		l.updatePerson(l.search("Deaglan", "123 cambridge road"), 1, "111 manc road");
		assertNotNull(l.search("Deaglan", "111 manc road"));
	}

	@Test
	public void testAddStringStringStringStringStringIntInt() {
		Library l = new Library(); 
		l.add("1337", "Drone Flight Control Simulator", "Deaglan Lynch", "Anglia Ruskin", "2017", "8000", "7418GB");
		assertNotNull(l.search("1337"));
	}

	@Test
	public void testAddStringStringStringStringStringStringString() {
		Library l = new Library(); 
		l.add("32135", "Test driven design in Java", "D Lynch", "Oracle", "2015", "Java Weekly", "dw197jkkbj-32141lol");
		assertNotNull(l.search("32135"));
	}

	@Test
	public void testAddStringStringStringStringStringFloatBooleanInt() {
		Library l = new Library(); 
		l.add("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187);
		assertNotNull(l.search("123"));
	}

	@Test
	public void testRemoveDocument() {
		Library l = new Library();
		l.add("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187);
		l.remove(l.search("123"));
		assertNull(l.search("123"));
		
	}

	@Test
	public void testRemovePerson() {
		Library l = new Library(); 
		l.addPerson("Deaglan Lynch", "111 manc road");
		l.remove(l.search("Deaglan Lynch", "111 manc road"));
		assertNull(l.search("Deaglan Lynch", "111 manc road"));
	}
	
	@Test
	public void testSaveLoad()
	{
		Library l = new Library(); 
		l.add("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187);
		l.add("32135", "Test driven design in Java", "D Lynch", "Oracle", "2015", "Java Weekly", "dw197jkkbj-32141lol");
		l.save();
		l.remove(l.search("123"));
		l.remove(l.search("32135"));
		l.load();
		assertNotNull(l.search("123"));
		
	}

}
