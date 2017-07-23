import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void returnInfoTest() {
		
		Person p = new Person("name", 1, "Unemployed");
		
		assertEquals("name " + 1 + " Unemployed", p.returnInfo());
	}

}
