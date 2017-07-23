import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PaintWizardTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test	
	public void cheapPaintTest()
	{
		PaintWizard pw = new PaintWizard(); 
		pw.findPaint();
		
		assertEquals("Cheapo Max which will cost: 99.95", pw.cheapestPaint(1000));
		assertEquals( "Averagejoes which will cost: 17.99", pw.cheapestPaint(23));
		assertEquals( "Averagejoes which will cost: 17.99", pw.cheapestPaint(30));
	}
	
	@Test	
	public void paintWasteTest()
	{
		PaintWizard pw = new PaintWizard(); 
		pw.findPaint();
		
		assertEquals("DuloxourousPaintsWhich wastes 0.0" ,pw.wastesTheLeast(1000));
		assertEquals("AveragejoesWhich wastes 142.0",pw.wastesTheLeast(23));
		assertEquals("AveragejoesWhich wastes 135.0",pw.wastesTheLeast(30));
	}

}
