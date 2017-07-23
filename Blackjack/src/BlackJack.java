import java.util.concurrent.ThreadLocalRandom;


public class BlackJack {

	public static void main(String[] args) {
		int card1 = ThreadLocalRandom.current().nextInt(0, 21);
		int card2 = ThreadLocalRandom.current().nextInt(0, 21);
		
		int card1D;
		int card2D;
		
		System.out.println("card 1 is " + card1);
		System.out.println("card 2 is " + card2);
		System.out.println();
		
		card1D = 21 - card1; 
		card2D = 21 - card2; 
		
		
		if (card1D == card2D)
		{
			System.out.println("Draw");
		}
		else if(card1D > card2D)
		{
			System.out.println("card 2 wins");
		}
		else if (card1D < card2D)
		{
			System.out.println("card 1 wins");
		}
		
		else
			System.out.println("I dont know you broke me");

	}

}
