import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GarageTest {

	
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void addVTest()
	{	
		Garage g = new Garage();
		
		g.addVehicle(42132, "chevvy", 321332, 6, 4, true);
		assertEquals("chevvy", g.contents.get(0).name);
		
		g.addVehicle(32132, "Lexmoto", 5000, 125);
		assertEquals(32132, g.contents.get(1).id);
		
		g.addVehicle(3218768, "chopper 7", 100000, 2, true);
		assertEquals(100000, g.contents.get(2).value);
	}
	
	@Test
	public void removeVTest()
	{
		Garage g = new Garage();
		
		g.addVehicle(42132, "chevvy", 321332, 6, 4, true);
		g.addVehicle(32132, "Lexmoto", 5000, 125);
		g.addVehicle(3218768, "chopper 7", 100000, 2, true);
		
		g.removeVehicle("chopper 7");
		assertEquals((int)2, (int)g.contents.size());
		
		g.removeVehicle(32132);
		assertEquals(1, g.contents.size());
		
		g.empty();
		assertEquals(0, g.contents.size());
	}
	
}
