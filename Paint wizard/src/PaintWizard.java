import java.util.ArrayList;
import java.util.List;

public class PaintWizard {
	public List<Paint> paints = new ArrayList<Paint>();

	public void findPaint() {
		paints.add(new Paint("Cheapo Max", 20, 10, 19.99f));
		paints.add(new Paint("Averagejoes", 15, 11, 17.99f));
		paints.add(new Paint("DuloxourousPaints", 10, 20, 25));
	}

	public String wastesTheLeast(int roomSize) {
		float val = 0;
		float waste;
		String name = null;
		int paintCans;

		for (Paint p : paints) {
			paintCans = 1;

			while ((p.capaticty * p.coveragePerLitreSq * paintCans) < roomSize) {
				paintCans++;
			}

			waste = (p.capaticty * p.coveragePerLitreSq * paintCans) - roomSize;

			if (waste < val) {
				val = waste;
				name = p.name;
			}
			else if(val == 0)
			{
				val = waste;
			}
		}
		

		return name + "Which wastes " + val;

	}

	public String cheapestPaint(int roomSize) {
		String name = null;
		int paintCans;
		float cheapest = 0;
		
		for (Paint p : paints)
		{
			paintCans = 1;

			while ((p.capaticty * p.coveragePerLitreSq * paintCans) < roomSize) 
			{
				paintCans++;
			}

			if ((paintCans * p.price) < cheapest) 
			{
				cheapest = paintCans * p.price;
				name = p.name;
			}
			else if(cheapest == 0)
			{
				cheapest = (paintCans * p.price);
				name = p.name;
				
			}
			
		}
		return name + " which will cost: " + cheapest;
	}
	
	public String listPaints()
	{
	   String r = ""; 
	   
	  for (Paint p : paints)
	  {
		  r = r + " " + p.name;
	  }
	  
	  return r; 
	}
}
