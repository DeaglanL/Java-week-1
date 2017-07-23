package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Library.Book;
import Library.Dissertation;
import Library.Person;

public class PersonTest {

	@Test
	public void testAdd() {
		Person p = new Person("D","address");
		p.add(new Book("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187));
		assertNotNull(p.search("123")); 
	}

	@Test
	public void testRemove() {
		Person p = new Person("D","address");
		p.add(new Book("123", "Of Mice and Men", "John Steinbeck", "Covici Friede", "1937",123.123f, true, 187));
		p.remove(p.search("123")); 
		assertNull(p.search("123")); 
	}

	@Test
	public void testSearch() {
		Person p = new Person("D","address");
		p.add(new Dissertation("32141", "test", "testpub", "321", "asdqdw", 32, 32));
		assertNotNull((p.search("32141"))); 
	}

}
