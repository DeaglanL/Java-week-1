import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("King: You there... Get the Paint wizard");
		PaintWizard Merlin = new PaintWizard(); 
		
		System.out.println("Merlin: Your highness, it is I Merlin the great paint wizard");
		System.out.println("King: Summon the paint!");
		
		Merlin.findPaint();
		System.out.println();
		System.out.println("Merlin: Here are the paints I just summoned with my paint magic: " + Merlin.listPaints());
        
		System.out.println();
		System.out.println("King: lets see which paint will let us waste the least?");
		System.out.println("Merlin: yes sir, Please the size of the room you wish to paint");
		int roomsize = sc.nextInt(); 
		System.out.println();
		System.out.println("Merlin: The Paint that will waste the least is " + Merlin.wastesTheLeast(roomsize));
		System.out.println();
		
		System.out.println("King: lets see which paint will be cheapest");
		System.out.println("Merlin: The Paint that will be cheapest is " + Merlin.cheapestPaint(roomsize));
		
		Math.
		
	}

}
 Int[][] array = new int[squarednumber]
		 
		 